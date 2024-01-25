import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class signup extends javax.swing.JFrame {
    public List<String> favourites = new ArrayList<>();
    public List<List<String>> owned = new ArrayList<>();
    public int userNum;
    public signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblCardNum = new javax.swing.JLabel();
        lblPhoneNum = new javax.swing.JLabel();
        lblCvc = new javax.swing.JLabel();
        lblExpiry = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtCardNum = new javax.swing.JTextField();
        txtPhoneNum = new javax.swing.JTextField();
        txtCvc = new javax.swing.JTextField();
        txtExpiry = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel7.setText("jLabel7");

        jTextField6.setText("jTextField6");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 217, 180));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Account Creation");

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPassword.setText("Password:");

        lblCardNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCardNum.setText("Card Number:  ");

        lblPhoneNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhoneNum.setText("Phone Number:");

        lblCvc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCvc.setText("CVC:");

        lblExpiry.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblExpiry.setText("Expiry Date:");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtCardNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtPhoneNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtCvc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtExpiry.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnCreate.setBackground(new java.awt.Color(157, 188, 152));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Begin Trading!");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(157, 188, 152));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblUsername)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtUsername))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblPassword)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPassword))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCardNum)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCardNum))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblPhoneNum)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPhoneNum, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCreate)
                                .addGap(18, 18, 18)
                                .addComponent(btnLogin))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(139, 139, 139)
                                        .addComponent(lblExpiry))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCvc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCvc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 155, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCardNum)
                    .addComponent(txtCardNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNum)
                    .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCvc)
                    .addComponent(lblExpiry)
                    .addComponent(txtCvc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(157, 188, 152));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login loginForm = new login();
        loginForm.setVisible(true);
        this.dispose(); // Close the signup form
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // Retrieve user input
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String expiry = txtExpiry.getText();
        long cardNum;
        long phoneNum;
        int cvc;

        // Validate and parse card number
        try {
            cardNum = Long.parseLong(txtCardNum.getText());
        } catch (NumberFormatException e) {
            handleInputError("Credit/Debit Card must only contain numbers.");
            return;
        }

        // Validate and parse phone number
        try {
            phoneNum = Long.parseLong(txtPhoneNum.getText());
        } catch (NumberFormatException e) {
            handleInputError("Provided phone number must only contain numbers");
            return;
        }

        // Validate and parse CVC
        try {
            cvc = Integer.parseInt(txtCvc.getText());
        } catch (NumberFormatException e) {
            handleInputError("CVC must only contain numbers");
            return;
        }

        // Validate username
        if (username.contains(" ") || username.contains(";")) {
            handleInputError("Username cannot contain spaces");
            return;
        }

        // Validate password using a utility method
        if (!sign_up.isPasswordEffective(password)) {
            handleInputError("Password must contain at least 8 characters, no spaces, one capital letter, and one special character");
            return;
        }

        // Validate expiry date using a utility method
        if (!sign_up.isValidExpiryDate(expiry)) {
            handleInputError("Expiry date must be a real date in MM/YY format, and card must not be expired");
            return;
        }

        // Validate phone number length
        if (Long.toString(phoneNum).length() != 10) {
            handleInputError("Phone number must be a valid length");
            return;
        }

        // Validate CVC length
        if (Integer.toString(cvc).length() != 3) {
            handleInputError("CVC must be a valid length");
            return;
        }

        // Validate credit/debit card number using a utility method
        if (!sign_up.isValidCardNumber(Long.toString(cardNum))) {
            handleInputError("Credit/debit card number is invalid");
            return;
        }

        // Check if the username already exists
        try {
            if (isUsernameExists(username)) {
                handleInputError("Username already exists. Choose a different username.");
                return;
            }
        } catch (IOException e) {
            handleFileError("Error reading from CSV file");
            return;
        }

        // Write the collected info to the CSV file
        writeDataToCsv(username, password, cardNum);
        // Display success message
        lblError.setText("Account created successfully");
    }//GEN-LAST:event_btnCreateActionPerformed
    
    // Method to handle input errors and display error messages
    private void handleInputError(String errorMessage) {
        lblError.setText(errorMessage);
    }

    // Method to handle file errors and display error messages
    private void handleFileError(String errorMessage) {
        lblError.setText(errorMessage);
    }

    // Method to write user data to CSV file
    private void writeDataToCsv(String username, String password, long cardNum) {
        try {
            // Open the CSV file for writing (append=true to add new entries)
            BufferedWriter writer = new BufferedWriter(new FileWriter("accounts.csv", true));

            // Check if the file is empty
            boolean fileIsEmpty = !Files.exists(Paths.get("accounts.csv")) || Files.size(Paths.get("accounts.csv")) == 0;

            // Get the next entry number
            int entryNumber = getNextEntryNumber(fileIsEmpty);

            // Add a new line only if the file is not empty
            if (!fileIsEmpty) {
                writer.newLine();
            }

            // Write the newNumber, username, password, and credit card number to the CSV file
            String lineToAdd = entryNumber + ";" + username + ";" + password + ";" + cardNum;

            // Ensure the last entry does not end with a semicolon
            if (lineToAdd.endsWith(";")) {
                lineToAdd = lineToAdd.substring(0, lineToAdd.length() - 1);
            }

            writer.write(lineToAdd);

            // Close the writer to release resources
            writer.close();
        } catch (IOException e) {
            // Handle the exception if reading or writing to the file fails
            handleFileError("Error reading or writing to CSV file");
            e.printStackTrace(); // Print the stack trace for debugging purposes
        }
    }

    // Method to get the next entry number
    private int getNextEntryNumber(boolean fileIsEmpty) {
        // Read the last entry number from the file and increment it
        if (!fileIsEmpty) {
            try (BufferedReader reader = new BufferedReader(new FileReader("accounts.csv"))) {
                // Read all lines to get the count
                long count = reader.lines().count();

                // If the count is greater than 0, return the count + 1
                if (count > 0) {
                    return (int) (count);
                }
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace(); // Print the stack trace for debugging purposes
            }
        }
        // If the file is empty or there's an error, start from 1
        return 1;
    }

    // Method to check if the username already exists in the CSV file
    private boolean isUsernameExists(String newUsername) throws IOException {
        // Check if the username already exists in the CSV file
        Path filePath = Paths.get("accounts.csv");
        if (Files.exists(filePath) && Files.size(filePath) > 0) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
                // Check if any line contains the specified username
                return reader.lines().anyMatch(line -> {
                    String[] parts = line.split(";");
                    return parts.length >= 2 && parts[1].equals(newUsername);
                });
            }
        }
        return false;
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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblCardNum;
    private javax.swing.JLabel lblCvc;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblExpiry;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNum;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtCardNum;
    private javax.swing.JTextField txtCvc;
    private javax.swing.JTextField txtExpiry;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
