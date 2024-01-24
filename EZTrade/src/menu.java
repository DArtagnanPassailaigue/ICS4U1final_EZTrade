import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.style.markers.SeriesMarkers;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class menu extends javax.swing.JFrame {
    private String symbol;
    private String interval;
    public menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainBackground = new javax.swing.JPanel();
        lblStockInput = new javax.swing.JLabel();
        txtStockInput = new javax.swing.JTextField();
        lblErrorMessage = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        favOwnedButton = new javax.swing.JButton();
        stockTimeInterval = new javax.swing.JComboBox<>();
        secondaryBackground = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(157, 188, 152));

        mainBackground.setBackground(new java.awt.Color(249, 239, 219));

        lblStockInput.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblStockInput.setForeground(new java.awt.Color(99, 136, 137));
        lblStockInput.setText("Stock Input:");

        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(99, 136, 137));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnExit.setForeground(new java.awt.Color(99, 136, 137));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        favOwnedButton.setText("See Favourited/Owned Stocks");
        favOwnedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favOwnedButtonActionPerformed(evt);
            }
        });

        stockTimeInterval.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "daily", "weekly", "monthly" }));

        javax.swing.GroupLayout mainBackgroundLayout = new javax.swing.GroupLayout(mainBackground);
        mainBackground.setLayout(mainBackgroundLayout);
        mainBackgroundLayout.setHorizontalGroup(
            mainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainBackgroundLayout.createSequentialGroup()
                        .addComponent(lblStockInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStockInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favOwnedButton)
                    .addComponent(stockTimeInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
            .addComponent(lblErrorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainBackgroundLayout.setVerticalGroup(
            mainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStockInput)
                    .addComponent(txtStockInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stockTimeInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblErrorMessage)
                .addGap(13, 13, 13)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addGap(18, 18, 18)
                .addComponent(favOwnedButton)
                .addGap(73, 73, 73))
        );

        secondaryBackground.setBackground(new java.awt.Color(157, 188, 152));

        javax.swing.GroupLayout secondaryBackgroundLayout = new javax.swing.GroupLayout(secondaryBackground);
        secondaryBackground.setLayout(secondaryBackgroundLayout);
        secondaryBackgroundLayout.setHorizontalGroup(
            secondaryBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );
        secondaryBackgroundLayout.setVerticalGroup(
            secondaryBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jMenu1.setText("Owned Stocks");
        menuBar.add(jMenu1);

        jMenu2.setText("Favourite Stocks");
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(secondaryBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 256, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondaryBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // API Key for stock data retrieval
        String apiKey = "H4CTFTLF7A5N7CLW";
        // Instance of the menu_class for stock data retrieval

        menu_class stockDataRetriever = new menu_class(apiKey);
        // Get selected time interval and stock symbol from GUI components
        String selectedOption = stockTimeInterval.getSelectedItem().toString();
        String stockSymbol = txtStockInput.getText();
        // Validate the entered stock symbol
        String validationMessage = stockDataRetriever.isValidStockSymbol(stockSymbol);
        // Display validation message if there is an issue
        if (validationMessage != null) {
            lblErrorMessage.setText(validationMessage);
        } else {
            // Retrieve stock data using the menu_class
            String retrievalMessage = stockDataRetriever.retrieveStockData(stockSymbol, selectedOption);
            // Display retrieval message or proceed to stockinfo frame
            if (retrievalMessage != null) {
                lblErrorMessage.setText(retrievalMessage);
            } else {
                stockinfo Stockinfo = new stockinfo();
                Stockinfo.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed
/*
    private String getTimeSeriesKey(String selectedOption) {
        switch (selectedOption.toLowerCase()) {
            case "daily":
                return "Time Series (Daily)";
            case "weekly":
                return "Time Series (Weekly)";
            case "monthly":
                return "Time Series (Monthly)";
            default:
                throw new IllegalArgumentException("Invalid time series option: " + selectedOption);
        }
    }
            */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void favOwnedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favOwnedButtonActionPerformed
        //
    }//GEN-LAST:event_favOwnedButtonActionPerformed

    // Setter methods for symbol and interval
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    public void setInterval(String interval){
        this.interval = interval;
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton favOwnedButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblStockInput;
    private javax.swing.JPanel mainBackground;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel secondaryBackground;
    private javax.swing.JComboBox<String> stockTimeInterval;
    private javax.swing.JTextField txtStockInput;
    // End of variables declaration//GEN-END:variables
}
