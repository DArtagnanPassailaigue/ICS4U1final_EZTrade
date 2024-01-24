import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class menu_class {
    private final String apiKey;

    public menu_class(String apiKey) {
        this.apiKey = apiKey;
    }

    public String isValidStockSymbol(String stockSymbol) {
        if (stockSymbol == null || stockSymbol.trim().isEmpty()) {
            return "Invalid stock symbol. Please check your input.";
        }
        return null; // Indicates valid stock symbol
    }

    public String retrieveStockData(String stockSymbol, String timeInterval) {
        String validationMessage = isValidStockSymbol(stockSymbol);
        if (validationMessage != null) {
            // Write the validation error message to the JSON file
            writeResponseToFile("stock.json", validationMessage);
            return validationMessage; // Return validation error message
        }

        try {
            String apiUrl = constructApiUrl(timeInterval, stockSymbol, apiKey);
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine).append("\n");
                }

                in.close();

                // Write the JSON response to the stock.json file, overwriting existing content
                writeResponseToFile("stock.json", response.toString());

                // Check if the response contains an error message
                if (response.toString().contains("\"Error Message\"")) {
                    return "Error: Symbol not recognized by the API";
                }

                return null; // Indicates successful retrieval
            } else {
                String errorMessage = "Error: " + responseCode;
                // Write the error message to the JSON file
                writeResponseToFile("stock.json", errorMessage);
                return errorMessage; // Return error message
            }
        } catch (Exception e) {
            e.printStackTrace();
            String errorMessage = "Error retrieving stock data. Please try again.";
            // Write the error message to the JSON file
            writeResponseToFile("stock.json", errorMessage);
            return errorMessage; // Return error message
        }
    }

    private String constructApiUrl(String timeInterval, String stockSymbol, String apiKey) {
        String baseUrl = "https://www.alphavantage.co/query?function=";

        switch (timeInterval.toLowerCase()) {
            case "previous day":
                return baseUrl + "TIME_SERIES_DAILY&symbol=" + stockSymbol + "&apikey=" + apiKey;

            case "previous month":
                return baseUrl + "TIME_SERIES_MONTHLY&symbol=" + stockSymbol + "&apikey=" + apiKey;

            case "previous year":
                return baseUrl + "TIME_SERIES_YEARLY&symbol=" + stockSymbol + "&apikey=" + apiKey;

            // Default to intraday if no valid time interval is provided
            default:
                return baseUrl + "TIME_SERIES_INTRADAY&symbol=" + stockSymbol + "&interval=5min&apikey=" + apiKey;
        }
    }

    private void writeResponseToFile(String fileName, String data) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(data);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
