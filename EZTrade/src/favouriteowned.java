
import java.util.Arrays;
import java.util.List;

public class favouriteowned extends javax.swing.JFrame {
    List<String> favouriteStocks = Arrays.asList(); // import favourited stocks from file here
    List<String> ownedStocks = Arrays.asList(); // import favourited stocks from file here
    public favouriteowned() {
        Sort.quickSort(favouriteStocks);
        Sort.quickSort(ownedStocks);
        favouriteField.setText(Sort.buildTextBlock(favouriteStocks));
        ownedField.setText(Sort.buildTextBlock(ownedStocks));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        errorField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        favouriteField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ownedField = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        claimButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        holdingField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        errorField.setEditable(false);
        errorField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        favouriteField.setEditable(false);
        favouriteField.setColumns(1);
        favouriteField.setRows(100);
        jScrollPane1.setViewportView(favouriteField);

        ownedField.setEditable(false);
        ownedField.setColumns(1);
        ownedField.setRows(100);
        jScrollPane2.setViewportView(ownedField);

        jLabel1.setText("Favourites");

        jLabel2.setText("Owned");

        addButton.setText("Add Funds:");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        claimButton.setText("Claim Earnings");
        claimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claimButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Current Holdings:");

        holdingField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(errorField)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(claimButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(holdingField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addGap(4, 4, 4)
                                .addComponent(addField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(claimButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(holdingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        double toAdd;
        double currentFunds = 0; // get this from the file
        try {
            toAdd = Double.parseDouble(addField.getText());
        } catch (NumberFormatException e){
            errorField.setText("Please enter a valid numerical amount");
            return;
        }
        if (toAdd < 0){
            errorField.setText("Please enter a positive amount of money to add to your account");
            return;
        }
        double added = toAdd + currentFunds;
        // set the user's money in account to "added"
        errorField.setText("$" + Double.toString(toAdd) + " pending onto your account, bank contacted");
    }//GEN-LAST:event_addButtonActionPerformed

    private void claimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claimButtonActionPerformed
        double accountHoldings = 0; // get this from user file
        double claimed = accountHoldings;
        if (claimed == 0){
            errorField.setText("There is no money in your account to claim");
        }
        double finalClaimed = claimed * 0.985;
        double stolen = claimed * 0.015;
        errorField.setText("$" + finalClaimed + " added to your bank account, $" + stolen + " subtracted as payment. Thank you for choosing EZTrade!");
        double newAcc = 0;
        // set the user's balance to newAcc;
    }//GEN-LAST:event_claimButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        /*
        menu m = new menu();
        m.setVisible((true));
        this.dispose();
        */
    }//GEN-LAST:event_backButtonActionPerformed

    /*
    add
        double toAdd;
        double currentFunds = 0; // get this from the file
        try {
            toAdd = Double.parseDouble(addField.getText());
        } catch (NumberFormatException e){
            errorField.setText("Please enter a valid numerical amount");
            return;
        }
        if (toAdd < 0){
            errorField.setText("Please enter a positive amount of money to add to your account");
            return;
        }
        double added = toAdd + currentFunds;
        // set the user's money in account to "added"
        errorField.setText("$" + Double.toString(toAdd) + " pending onto your account, bank contacted");
    
    claim
        double accountHoldings = 0; // get this from user file
        double claimed = accountHoldings;
        if (claimed == 0){
            errorField.setText("There is no money in your account to claim");
        }
        double finalClaimed = claimed * 0.985;
        double stolen = claimed * 0.015;
        errorField.setText("$" + finalClaimed + " added to your bank account, $" + stolen + " subtracted as payment. Thank you for choosing EZTrade!");
        double newAcc = 0;
        // set the user's balance to newAcc;
    
    back
        /*
        menu m = new menu();
        m.setVisible((true));
        this.dispose();
        */
    
    
    
    
    
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
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addField;
    private javax.swing.JButton backButton;
    private javax.swing.JButton claimButton;
    private javax.swing.JTextField errorField;
    private javax.swing.JTextArea favouriteField;
    private javax.swing.JTextField holdingField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea ownedField;
    // End of variables declaration//GEN-END:variables
}
