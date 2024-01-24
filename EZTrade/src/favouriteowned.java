
import java.util.Arrays;
import java.util.List;

public class favouriteowned extends javax.swing.JFrame {
    List<String> favouriteStocks = Arrays.asList(); // import favourited stocks from file here
    List<String> ownedStocks = Arrays.asList(); // import favourited stocks from file here
    public favouriteowned() {
        Sort.quickSort(favouriteStocks);
        Sort.quickSort(ownedStocks);
        favouriteField.setText(Sort.buildTextBlock(favouriteStocks));
        txtarOwn.setText(Sort.buildTextBlock(ownedStocks));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        favouriteField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        mainPanel = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtarOwn = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        lblOwn = new javax.swing.JLabel();
        lblFav = new javax.swing.JLabel();
        lblAdd = new javax.swing.JLabel();
        lblHolding = new javax.swing.JLabel();
        txtAdd = new javax.swing.JTextField();
        txtHolding = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClaim = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtarFav = new javax.swing.JTextArea();
        lblError = new javax.swing.JLabel();
        secondaryFrame = new javax.swing.JPanel();

        favouriteField.setEditable(false);
        favouriteField.setColumns(1);
        favouriteField.setRows(100);
        jScrollPane1.setViewportView(favouriteField);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(235, 217, 180));

        txtarOwn.setEditable(false);
        txtarOwn.setColumns(20);
        txtarOwn.setRows(5);
        jScrollPane8.setViewportView(txtarOwn);

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(99, 136, 137));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOwn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOwn.setForeground(new java.awt.Color(99, 136, 137));
        lblOwn.setText("Owned:");

        lblFav.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFav.setForeground(new java.awt.Color(99, 136, 137));
        lblFav.setText("Favourited:");

        lblAdd.setBackground(new java.awt.Color(99, 136, 137));
        lblAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAdd.setForeground(new java.awt.Color(99, 136, 137));
        lblAdd.setText("Add Funds:");

        lblHolding.setBackground(new java.awt.Color(99, 136, 137));
        lblHolding.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHolding.setForeground(new java.awt.Color(99, 136, 137));
        lblHolding.setText("Current Hodings:");

        txtAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtHolding.setEditable(false);
        txtHolding.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(157, 188, 152));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClaim.setBackground(new java.awt.Color(157, 188, 152));
        btnClaim.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClaim.setForeground(new java.awt.Color(255, 255, 255));
        btnClaim.setText("Claim Earnings");
        btnClaim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClaimActionPerformed(evt);
            }
        });

        txtarFav.setEditable(false);
        txtarFav.setColumns(20);
        txtarFav.setRows(5);
        jScrollPane10.setViewportView(txtarFav);

        lblError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(lblHolding)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHolding))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblFav, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addComponent(lblAdd)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(30, 30, 30)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClaim))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOwn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOwn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFav)))
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdd)
                    .addComponent(btnAdd)
                    .addComponent(btnClaim)
                    .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHolding)
                    .addComponent(txtHolding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        secondaryFrame.setBackground(new java.awt.Color(157, 188, 152));

        javax.swing.GroupLayout secondaryFrameLayout = new javax.swing.GroupLayout(secondaryFrame);
        secondaryFrame.setLayout(secondaryFrameLayout);
        secondaryFrameLayout.setHorizontalGroup(
            secondaryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        secondaryFrameLayout.setVerticalGroup(
            secondaryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(secondaryFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondaryFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        double toAdd;
        double currentFunds = 0; // get this from the file
        try {
            toAdd = Double.parseDouble(txtAdd.getText());
        } catch (NumberFormatException e){
            lblError.setText("Please enter a valid numerical amount");
            return;
        }
        if (toAdd < 0){
            lblError.setText("Please enter a positive amount of money to add to your account");
            return;
        }
        double added = toAdd + currentFunds;
        // set the user's money in account to "added"
        lblError.setText("$" + Double.toString(toAdd) + " pending onto your account, bank contacted");    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClaimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClaimActionPerformed
        double accountHoldings = 0; // get this from user file
        double claimed = accountHoldings;
        if (claimed == 0){
            lblError.setText("There is no money in your account to claim");
        }
        double finalClaimed = claimed * 0.985;
        double stolen = claimed * 0.015;
        lblError.setText("$" + finalClaimed + " added to your bank account, $" + stolen + " subtracted as payment. Thank you for choosing EZTrade!");
        double newAcc = 0;
        // set the user's balance to newAcc;
    }//GEN-LAST:event_btnClaimActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        /*
        menu m = new menu();
        m.setVisible((true));
        this.dispose();
        */
    }//GEN-LAST:event_btnBackActionPerformed
 
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(favouriteowned.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(favouriteowned.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(favouriteowned.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(favouriteowned.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new favouriteowned().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClaim;
    private javax.swing.JTextArea favouriteField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFav;
    private javax.swing.JLabel lblHolding;
    private javax.swing.JLabel lblOwn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel secondaryFrame;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtHolding;
    private javax.swing.JTextArea txtarFav;
    private javax.swing.JTextArea txtarOwn;
    // End of variables declaration//GEN-END:variables
}
