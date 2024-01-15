import java.io.*;
import java.net.*;
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 22isr
 */
public class menu_class {
    private final String apiKey;

    public menu_class(String apiKey) {
        this.apiKey = apiKey;
    }

    public boolean retrieveStockData(String stockSymbol) {
        try {
            String apiUrl = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=" + stockSymbol + "&interval=5min&apikey=" + apiKey;
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

                System.out.println("Stock data written to file: stock.json");
                return true;
            } else {
                System.out.println("Error: " + responseCode);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
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
