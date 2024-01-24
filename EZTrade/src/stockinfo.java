import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class stockinfo extends javax.swing.JFrame {
    // Static variables to hold stock information
    public static String symbol;
    public static double accountHoldings = 1000; // get actual account holdings from user file
    private String apiKey = "H4CTFTLF7A5N7CLW";
    public static double avgOpen;
    public stockinfo() {
        initComponents();
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
        if (purchaseTotal > accountHoldings){
            lblError.setText("Insufficcient Funds");
            return; // Exit the method if funds are insufficient.
        }
        // Deduct the purchase amount from the user's account holdings.
        accountHoldings = accountHoldings - purchaseTotal;
        // Update the error label to indicate a successful purchase and display the stock symbol.
        lblError.setText("Shares bought successfully, " + stockKey + " added to owned stocks");
        // Update the displayed account balance after the purchase.
        txtAccount.setText("$" + String.format("%.2f", accountHoldings));
        // TODO: Update account holdings in the user file. This step may involve saving the changes to a file.
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        // Retrieve the average opening stock price for the selected stock.
        double stockCost = avgOpen; // TODO: pull the stock cost from the stock file
        // Assuming the user owns a fixed amount of the given stock, specify the owned stock amount.
        int ownedStockAmount = 2; // pull the amount of the given stock owned by the user from the user account file
        String stockKey = symbol;
        double sellTotal = stockCost * ownedStockAmount;
        accountHoldings = accountHoldings + sellTotal;
        txtAccount.setText("$" + String.format("%.2f", accountHoldings));
        // UPDATE ACCOUNT HOLDINGS IN USER FILE
        lblError.setText("Shares sold successfully, " + stockKey + " removed from owned stocks");    }//GEN-LAST:event_btnSellActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        menu m = new menu();
        m.setVisible((true));
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnFavouriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavouriteActionPerformed
        // add stock key to favourited stocks in account file
        String stockKey = symbol;
        lblError.setText(stockKey + " added to favourite stocks");
    }//GEN-LAST:event_btnFavouriteActionPerformed

    
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

    public static void main(String args[]) {
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
                new stockinfo().setVisible(true);
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
