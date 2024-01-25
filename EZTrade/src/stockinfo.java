import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import java.io.*;
import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.style.markers.SeriesMarkers;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.text.SimpleDateFormat;
import java.util.*;

public class stockinfo extends javax.swing.JFrame {
    // Static variables to hold stock information
    public static String symbol;
    public static double accountHoldings;
    private String apiKey = "H4CTFTLF7A5N7CLW";
    public static double avgOpen;
    private static int firstNumber;
    public stockinfo(int firstNumber) {
        initComponents();
        this.firstNumber = firstNumber;
        updateAccountHoldings();
        txtAccount.setText("$" + String.format("%.2f", accountHoldings));
        initialize();        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jScrollBar1 = new javax.swing.JScrollBar();
        mainPanel = new javax.swing.JPanel();
        lblMoney = new javax.swing.JLabel();
        btnPurchase = new javax.swing.JButton();
        btnSell = new javax.swing.JButton();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtAccount = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarInfo = new javax.swing.JTextArea();
        btnFavourite = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        secondaryPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(235, 217, 180));

        lblMoney.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMoney.setForeground(new java.awt.Color(99, 136, 137));
        lblMoney.setText("Money In Account:");

        btnPurchase.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPurchase.setForeground(new java.awt.Color(99, 136, 137));
        btnPurchase.setText("Purchase");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        btnSell.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSell.setForeground(new java.awt.Color(99, 136, 137));
        btnSell.setText("Sell");
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });

        lblAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(99, 136, 137));
        lblAmount.setText("Amount:");

        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtAccount.setEditable(false);
        txtAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(99, 136, 137));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtarInfo.setEditable(false);
        txtarInfo.setBackground(new java.awt.Color(249, 239, 219));
        txtarInfo.setColumns(20);
        txtarInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtarInfo.setForeground(new java.awt.Color(99, 136, 137));
        txtarInfo.setRows(5);
        jScrollPane1.setViewportView(txtarInfo);

        btnFavourite.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFavourite.setForeground(new java.awt.Color(99, 136, 137));
        btnFavourite.setText("Favourite");
        btnFavourite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavouriteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(lblMoney)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFavourite, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(lblAmount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(106, 106, 106)
                                        .addComponent(btnPurchase)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSell, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(84, 84, 84))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFavourite)
                    .addComponent(lblMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPurchase)
                    .addComponent(btnSell)
                    .addComponent(lblAmount))
                .addGap(1, 1, 1)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        secondaryPanel.setBackground(new java.awt.Color(157, 188, 152));

        javax.swing.GroupLayout secondaryPanelLayout = new javax.swing.GroupLayout(secondaryPanel);
        secondaryPanel.setLayout(secondaryPanelLayout);
        secondaryPanelLayout.setHorizontalGroup(
            secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        secondaryPanelLayout.setVerticalGroup(
            secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(secondaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondaryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        // Retrieve the average opening stock price for the selected stock.
        double stockCost = avgOpen;
        // Declare variables to store the user's input.
        int stockAmount;
        String stockKey = symbol;

        try {
            // Attempt to convert the text entered in the "Amount" field to an integer.
            stockAmount = Integer.parseInt(txtAmount.getText());
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid integer.
            lblError.setText("Please enter a valid amount of shares to buy.");
            return; // Exit the method to prevent further execution.
        }

        // Calculate the total cost of purchasing the specified amount of stocks.
        double purchaseTotal = stockCost * stockAmount;

        // Check if the user has sufficient funds to make the purchase.
        if (purchaseTotal > accountHoldings) {
            lblError.setText("Insufficient Funds");
            return; // Exit the method if funds are insufficient.
        }

        // Deduct the purchase amount from the user's account holdings.
        accountHoldings = accountHoldings - purchaseTotal;

        // Update the error label to indicate a successful purchase and display the stock symbol.
        lblError.setText("Shares bought successfully, " + stockKey + " added to owned stocks");

        // Update the displayed account balance after the purchase.
        txtAccount.setText("$" + String.format("%.2f", accountHoldings));

        // Save the updated account holdings and stock information to the CSV file
        saveAccountHoldingsToCSV();
        
        // Add or update the stock in the 2D list in the 7th column of the CSV file
        updateOwnedStocks(stockKey, stockAmount);
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        // Retrieve the average opening stock price for the selected stock.
        double stockCost = avgOpen; // TODO: pull the stock cost from the stock file

        // Assuming the user owns a fixed amount of the given stock, specify the owned stock amount.
        int ownedStockAmount = 2; // TODO: pull the amount of the given stock owned by the user from the user account file
        String stockKey = symbol;

        // Calculate the total amount from selling the owned stock.
        double sellTotal = stockCost * ownedStockAmount;

        // Increase the account holdings by the sell total.
        accountHoldings = accountHoldings + sellTotal;

        // Update the displayed account balance after the sale.
        txtAccount.setText("$" + String.format("%.2f", accountHoldings));

        // Remove the stock from the user's owned 2D list.
        removeStockFromOwnedList(stockKey);

        // Save the updated account holdings and stock information to the CSV file.
        saveAccountHoldingsToCSV();

        // Update the error label to indicate a successful sale and display the stock symbol.
        lblError.setText("Shares sold successfully, " + stockKey + " removed from owned stocks");    }//GEN-LAST:event_btnSellActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        menu m = new menu(firstNumber);
        m.setVisible((true));
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnFavouriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavouriteActionPerformed
        // add stock key to favourited stocks in account file
        String stockKey = symbol;
        addStockToFavorites(stockKey);
    }//GEN-LAST:event_btnFavouriteActionPerformed

    private void updateAccountHoldings() {
        // Specify the file path for user accounts data (CSV file)
        String filePath = "accounts.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Iterate through each line in the file
            while ((line = reader.readLine()) != null) {
                // Split the line into parts using a comma as the delimiter
                String[] parts = line.split(";");
                // Check if the line contains the user's account number
                if (parts.length == 7 && Integer.parseInt(parts[0].trim()) == firstNumber) {
                    // Extract and update the accountHoldings variable
                    accountHoldings = Double.parseDouble(parts[4].trim());
                    return;  // Stop iterating once the user is found
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException appropriately (log, show error message, etc.)
        }

        // If the user is not found or an error occurs, set accountHoldings to 0
        accountHoldings = 0;
    }
    
    private void saveAccountHoldingsToCSV() {
        String filePath = "accounts.csv";
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 7 && Integer.parseInt(parts[0].trim()) == firstNumber) {
                    // Modify the accountHoldings value in the line
                    parts[4] = Double.toString(accountHoldings);
                    line = String.join(";", parts);
                }
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException appropriately (log, show error message, etc.)
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write the updated content back to the file
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException appropriately (log, show error message, etc.)
        }
    }
    
    private void addStockToFavorites(String stockKey) {
        String filePath = "accounts.csv";
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 7 && Integer.parseInt(parts[0].trim()) == firstNumber) {
                    // Check if the stockKey is already in the favorites list
                    String favorites = parts[5].trim();
                    List<String> favoritesList = new ArrayList<>(Arrays.asList(favorites.split(";")));

                    if (!favoritesList.contains(stockKey)) {
                        // Stock symbol not found, add it to favorites
                        favoritesList.add(stockKey);
                        parts[5] = String.join(";", favoritesList);
                        line = String.join(";", parts);
                    } else {
                        // Stock symbol is already in favorites, return without adding it again
                        lblError.setText(stockKey + " is already in favorite stocks");
                        return;
                    }
                }
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException appropriately (log, show error message, etc.)
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write the updated content back to the file
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException appropriately (log, show error message, etc.)
        }

        lblError.setText(stockKey + " added to favorite stocks");
    }


    // Method to update the 2D list in the 7th column of the CSV file
    private void updateOwnedStocks(String stockKey, int stockAmount) {
        String filePath = "accounts.csv";
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 7 && Integer.parseInt(parts[0].trim()) == firstNumber) {
                    // Update the 2D list in the 7th column
                    String ownedStocks = parts[6].trim();
                    if (!ownedStocks.isEmpty()) {
                        ownedStocks += ";"; // Add a semicolon if the ownedStocks list is not empty
                    }

                    // Check if the stockKey is already in the ownedStocks list
                    boolean stockAlreadyOwned = false;
                    for (String stock : ownedStocks.split(";")) {
                        String[] stockInfo = stock.split("\\[");
                        if (stockInfo.length > 0 && stockInfo[0].equals(stockKey)) {
                            stockAlreadyOwned = true;
                            // Update the number of owned shares
                            int currentShares = Integer.parseInt(stockInfo[1].replace("]", ""));
                            currentShares += stockAmount;
                            stock = stockKey + "[" + currentShares + "]";
                            break;
                        }
                    }

                    if (!stockAlreadyOwned) {
                        // Stock symbol not found, add it to ownedStocks
                        ownedStocks += stockKey + "[" + stockAmount + "]";
                    }

                    parts[6] = ownedStocks;
                    line = String.join(";", parts);
                }
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException appropriately (log, show error message, etc.)
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write the updated content back to the file
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException appropriately (log, show error message, etc.)
        }
    }
    
    private void removeStockFromOwnedList(String stockKey) {
        String filePath = "accounts.csv";
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 7 && Integer.parseInt(parts[0].trim()) == firstNumber) {
                    // Update the 2D list in the 7th column
                    String ownedStocks = parts[6].trim();
                    List<String> updatedStocks = new ArrayList<>();

                    for (String stock : ownedStocks.split(";")) {
                        String[] stockInfo = stock.split("\\[");
                        if (stockInfo.length > 0 && !stockInfo[0].equals(stockKey)) {
                            updatedStocks.add(stock);
                        }
                    }

                    // Update the ownedStocks with the modified list
                    parts[6] = String.join(";", updatedStocks);
                    line = String.join(";", parts);
                }
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException appropriately (log, show error message, etc.)
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write the updated content back to the file
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException appropriately (log, show error message, etc.)
        }
    }
    
    public void initialize(){
        menu_class stockDataRetriever = new menu_class(apiKey);
        String filePath = "stock.json";
        StringBuilder resultBuilder = parseStockData(filePath);
        
        if (resultBuilder != null) {
            System.out.println(resultBuilder.toString());
            txtarInfo.setText(resultBuilder.toString()); // Display the result in the JTextArea
        } else {
            System.out.println("Error parsing stock data.");
        }
    }
    
    public static StringBuilder parseStockData(String filePath) {
        StringBuilder resultBuilder = new StringBuilder();
        StringBuilder rawData = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isInMetaSection = false;
            boolean isInTimeSeriesSection = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains("Meta Data")) {
                    isInMetaSection = true;
                    isInTimeSeriesSection = false;
                    continue;
                }

                if (line.contains("Time Series")) {
                    isInMetaSection = false;
                    isInTimeSeriesSection = true;
                    continue;
                }

                if (isInMetaSection) {
                    processMetaData(line, resultBuilder);
                } else if (isInTimeSeriesSection) {
                    rawData.append(line).append("\n");
                }
            }
            // Calculate averages after reading all lines
            calculateAverages(rawData, resultBuilder);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return resultBuilder;
    }

    private static void processMetaData(String line, StringBuilder resultBuilder) {
        if (line.contains("2. Symbol")) {
            resultBuilder.append("Symbol: ").append(getValueFromLine(line)).append("\n");
            symbol = getValueFromLine(line);
        } else if (line.contains("3. Last Refreshed")) {
            resultBuilder.append("Last Refreshed: ").append(getValueFromLine(line)).append("\n");
        } else if (line.contains("4. Interval")) {
            //nothing
        } else if (line.contains("5. Output Size")) {
            //nothing
        } else if (line.contains("6. Time Zone")) {
            resultBuilder.append("Time Zone: ").append(getValueFromLine(line)).append("\n");
        }
    }

    private static String getValueFromLine(String line) {
        return line.split(":")[1].trim().replace("\"", "").replace(",", "");
    }

    private static void calculateAverages(StringBuilder rawData, StringBuilder resultBuilder) {
        double sumOpen = 0;
        double sumClose = 0;
        double sumHigh = 0;
        double sumLow = 0;
        double sumVolume = 0;
        int countOpen = 0;
        int countClose = 0;
        int countHigh = 0;
        int countLow = 0;
        int countVolume = 0;

        String[] lines = rawData.toString().split("\n");
        for (String line : lines) {
            if (line.contains("open")) {
                sumOpen += getValue(line, "open");
                countOpen++;
            } else if (line.contains("close")) {
                sumClose += getValue(line, "close");
                countClose++;
            } else if (line.contains("high")){
                sumHigh += getValue(line, "high");
                countHigh++;
            } else if (line.contains("low")){
                sumLow += getValue(line, "low");
                countLow++;
            } else if (line.contains("volume")){
                sumVolume += getValue(line, "volume");
                countVolume++;
            }
        }

        avgOpen = sumOpen / countOpen++;
        double avgClose = sumClose / countClose++;
        double avgHigh = sumHigh / countHigh++;
        double avgLow = sumLow / countLow++;
        double avgVolume = sumVolume / countVolume++;

        // Format the doubles to two decimal places
        resultBuilder.append("Average Opening Price: ").append(String.format("%.2f", avgOpen)).append("\n");
        resultBuilder.append("Average Closing Price: ").append(String.format("%.2f", avgClose)).append("\n");
        resultBuilder.append("Average High Price: ").append(String.format("%.2f", avgHigh)).append("\n");
        resultBuilder.append("Average Low Price: ").append(String.format("%.2f", avgLow)).append("\n");
        resultBuilder.append("Average Volume: ").append(String.format("%.2f", avgVolume)).append("\n");
        
    }

    private static double getValue(String line, String key) {
        // Extract the value associated with the given key
        if (line.contains(key)) {
            return Double.parseDouble(line.split(":")[1].trim().replace("\"", "").replace(",", ""));
        }
        return 0;
    }
    
    private static String determineInterval(JSONObject jsonObject) {
        // Check if "Time Series" exists for daily, weekly, or monthly
        if (jsonObject.containsKey("Time Series (Daily)")) {
            return "Time Series (Daily)";
        } else if (jsonObject.containsKey("Time Series (Weekly)")) {
            return "Time Series (Weekly)";
        } else if (jsonObject.containsKey("Time Series (Monthly)")) {
            return "Time Series (Monthly)";
        }
        return null;
    }
    
    public static void main(String args[]) {
        try {
            // Read JSON File
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader("stock.json"));
            JSONObject jsonObject = (JSONObject) obj;

            // Determine the Interval (daily, weekly, monthly)
            String interval = determineInterval(jsonObject);

            if (interval == null) {
                System.out.println("Unable to determine the data interval.");
                return;
            }

            // Extract Open Values and Dates based on Interval
            List<Date> dates = new ArrayList<>();
            List<Double> openValues = new ArrayList<>();

            JSONObject timeSeries = (JSONObject) jsonObject.get(interval);

            // Check if timeSeries is not null
            if (timeSeries != null) {
                // Get the keys (dates) and reverse them to get the most recent dates first
                List<String> sortedDates = new ArrayList<>(timeSeries.keySet());
                sortedDates.sort((date1, date2) -> date2.compareTo(date1));

                int count = 0;
                for (String dateString : sortedDates) {
                    JSONObject data = (JSONObject) timeSeries.get(dateString);
                    double open = Double.parseDouble((String) data.get("1. open"));

                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date date;

                    try {
                        date = dateFormat.parse(dateString);
                    } catch (java.text.ParseException e) {
                        e.printStackTrace();
                        continue; // Skip this date and proceed with the next one
                    }

                    dates.add(date);
                    openValues.add(open);

                    count++;
                    if (count == 5) {
                        break; // Stop after getting the last 5 values
                    }
                }
            } else {
                System.out.println("No data available for the selected interval.");
                return;
            }

            // Create XChart Line Chart
            String chartTitle = "Last 5 Open Values - " + interval.substring(0, 1).toUpperCase() + interval.substring(1);
            XYChart chart = new XYChartBuilder().width(800).height(600).title(chartTitle).xAxisTitle("Date").yAxisTitle("Open Value").build();

            chart.getStyler().setXAxisLabelRotation(45);

            chart.addSeries("Open Values", dates, openValues).setMarker(SeriesMarkers.CIRCLE);

            // Display the Chart
            if (!dates.isEmpty() && !openValues.isEmpty()) {
                SwingWrapper<XYChart> swingWrapper = new SwingWrapper<>(chart);
                swingWrapper.displayChart();

            } else {
                System.out.println("No data available for the chart.");
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(stockinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stockinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stockinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stockinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stockinfo(firstNumber).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFavourite;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnSell;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel secondaryPanel;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextArea txtarInfo;
    // End of variables declaration//GEN-END:variables
}
