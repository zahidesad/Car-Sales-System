package login;

import CorePackage.Customer;
import CorePackage.Database;
import CorePackage.Dealer;
import CorePackage.ITriggerer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class Register extends PanelCustom implements ITriggerer {

    private boolean flagForName = false;
    private boolean flagForEmail = false;
    private boolean flagForUsername = false;
    private boolean flagForPassword = false;
    private boolean flagForPhoneNumber = false;

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEmail = new SwingComponents.TextField();
        txtUsername = new SwingComponents.TextField();
        txtPassword = new SwingComponents.Password();
        registerDealerButton = new SwingComponents.Button();
        registerCustomerButton = new SwingComponents.Button();
        txtPhoneNumber = new SwingComponents.TextField();
        txtName = new SwingComponents.TextField();
        nameIconLabel = new javax.swing.JLabel();
        phoneNumberIconLabel = new javax.swing.JLabel();
        emailIconLabel = new javax.swing.JLabel();
        usernameIconLabel = new javax.swing.JLabel();
        passwordIconLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(53, 53, 53));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 243, 243));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP");

        txtEmail.setForeground(new java.awt.Color(242, 242, 242));
        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEmail.setHint("E-MAIL");
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        txtUsername.setForeground(new java.awt.Color(242, 242, 242));
        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtUsername.setHint("USERNAME");
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });

        txtPassword.setForeground(new java.awt.Color(242, 242, 242));
        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPassword.setHint("PASSWORD");
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        registerDealerButton.setBackground(new java.awt.Color(86, 142, 255));
        registerDealerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerDealerButton.setText("SIGN UP AS A DEALER");
        registerDealerButton.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        registerDealerButton.setPreferredSize(new java.awt.Dimension(120, 30));
        registerDealerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerDealerButtonActionPerformed(evt);
            }
        });

        registerCustomerButton.setBackground(new java.awt.Color(86, 142, 255));
        registerCustomerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerCustomerButton.setText("SIGN UP AS A CUSTOMER");
        registerCustomerButton.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        registerCustomerButton.setPreferredSize(new java.awt.Dimension(120, 30));
        registerCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCustomerButtonActionPerformed(evt);
            }
        });

        txtPhoneNumber.setForeground(new java.awt.Color(242, 242, 242));
        txtPhoneNumber.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPhoneNumber.setHint("PHONE NUMBER");
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });

        txtName.setForeground(new java.awt.Color(242, 242, 242));
        txtName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtName.setHint("NAME");
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerDealerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registerCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailIconLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(usernameIconLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(phoneNumberIconLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usernameIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phoneNumberIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerDealerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerDealerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerDealerButtonActionPerformed

        if (txtUsername.getText().equals("") || txtPassword.getText().equals("") || txtName.getText().equals("")
                || txtPhoneNumber.getText().equals("") || txtEmail.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Fill All Entries.",
                    "Failure", JOptionPane.INFORMATION_MESSAGE);

        } else if (Database.checkUsername(txtUsername.getText())) {
            JOptionPane.showMessageDialog(this, "Username Already Exist.",
                    "Failure", JOptionPane.INFORMATION_MESSAGE);

        } else if (flagForName == true && flagForEmail == true && flagForUsername == true && flagForPassword == true && flagForPhoneNumber == true) {
            Dealer dealer = new Dealer(txtUsername.getText(), txtPassword.getText(),
                    txtName.getText(), txtEmail.getText(), txtPhoneNumber.getText());
            Database.getUsers().add(dealer);
            JOptionPane.showMessageDialog(this, "Successfully Created Dealer Account ",
                    "Operation Successful", JOptionPane.INFORMATION_MESSAGE);
            txtUsername.setText("");
            txtPassword.setText("");
            txtName.setText("");
            txtEmail.setText("");
            txtPhoneNumber.setText("");

            nameIconLabel.setIcon(null);
            emailIconLabel.setIcon(null);
            usernameIconLabel.setIcon(null);
            passwordIconLabel.setIcon(null);
            phoneNumberIconLabel.setIcon(null);

        } else {
            JOptionPane.showMessageDialog(this, "A validation error has occurred. "
                    + "Please check the validation rules from the menu at the bottom right.",
                    "The Gaps Were Not Filled As Desired.", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_registerDealerButtonActionPerformed

    private void registerCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCustomerButtonActionPerformed
        if (txtUsername.getText().equals("") || txtPassword.getText().equals("") || txtName.getText().equals("")
                || txtPhoneNumber.getText().equals("") || txtEmail.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Fill All Entries.",
                    "Failure", JOptionPane.INFORMATION_MESSAGE);

        } else if (Database.checkUsername(txtUsername.getText())) {
            JOptionPane.showMessageDialog(this, "Username Already Exist.",
                    "Failure", JOptionPane.INFORMATION_MESSAGE);

        } else if (flagForName == true && flagForEmail == true && flagForUsername == true && flagForPassword == true && flagForPhoneNumber == true) {
            Customer customer = new Customer(txtUsername.getText(), txtPassword.getText(),
                    txtName.getText(), txtEmail.getText(), txtPhoneNumber.getText());
            Database.getUsers().add(customer);
            JOptionPane.showMessageDialog(this, "Successfully Created Customer Account ",
                    "Operation Successful", JOptionPane.INFORMATION_MESSAGE);
            txtUsername.setText("");
            txtPassword.setText("");
            txtName.setText("");
            txtEmail.setText("");
            txtPhoneNumber.setText("");

            nameIconLabel.setIcon(null);
            emailIconLabel.setIcon(null);
            usernameIconLabel.setIcon(null);
            passwordIconLabel.setIcon(null);
            phoneNumberIconLabel.setIcon(null);
        } else {
            JOptionPane.showMessageDialog(this, "A validation error has occurred. "
                    + "Please check the validation rules from the menu at the bottom right.",
                    "The Gaps Were Not Filled As Desired.", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_registerCustomerButtonActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        String name = txtName.getText();

        
        String regex = "^[A-Za-z]{2,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);

        if (matcher.matches()) {
            ImageIcon verifiedIcon = new ImageIcon("C:\\Icons\\verifiedIcon.png");
            nameIconLabel.setIcon(verifiedIcon);
            flagForName = true;
        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon("C:\\Icons\\nonVerifiedIcon.png");
            nameIconLabel.setIcon(nonVerifiedIcon);
            flagForName = false;
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        String email = txtEmail.getText();

        
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            ImageIcon verifiedIcon = new ImageIcon("C:\\Icons\\verifiedIcon.png");
            emailIconLabel.setIcon(verifiedIcon);
            flagForEmail = true;
        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon("C:\\Icons\\nonVerifiedIcon.png");
            emailIconLabel.setIcon(nonVerifiedIcon);
            flagForEmail = false;
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        String username = txtUsername.getText();

        String regex = "^[A-Za-z]\\w{3,29}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

        if (matcher.matches()) {
            ImageIcon verifiedIcon = new ImageIcon("C:\\Icons\\verifiedIcon.png");
            usernameIconLabel.setIcon(verifiedIcon);
            flagForUsername = true;
        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon("C:\\Icons\\nonVerifiedIcon.png");
            usernameIconLabel.setIcon(nonVerifiedIcon);
            flagForUsername = false;
        }
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        String password = txtPassword.getText();
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            ImageIcon verifiedIcon = new ImageIcon("C:\\Icons\\verifiedIcon.png");
            passwordIconLabel.setIcon(verifiedIcon);
            flagForPassword = true;
        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon("C:\\Icons\\nonVerifiedIcon.png");
            passwordIconLabel.setIcon(nonVerifiedIcon);
            flagForPassword = false;
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        String phoneNo = txtPhoneNumber.getText();
        String regex = "^\\d{3}-\\d{3}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNo);

        if (matcher.matches()) {
            ImageIcon verifiedIcon = new ImageIcon("C:\\Icons\\verifiedIcon.png");
            phoneNumberIconLabel.setIcon(verifiedIcon);
            flagForPhoneNumber = true;
        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon("C:\\Icons\\nonVerifiedIcon.png");
            phoneNumberIconLabel.setIcon(nonVerifiedIcon);
            flagForPhoneNumber = false;
        }
    }//GEN-LAST:event_txtPhoneNumberKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailIconLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameIconLabel;
    private javax.swing.JLabel passwordIconLabel;
    private javax.swing.JLabel phoneNumberIconLabel;
    private SwingComponents.Button registerCustomerButton;
    private SwingComponents.Button registerDealerButton;
    private SwingComponents.TextField txtEmail;
    private SwingComponents.TextField txtName;
    private SwingComponents.Password txtPassword;
    private SwingComponents.TextField txtPhoneNumber;
    private SwingComponents.TextField txtUsername;
    private javax.swing.JLabel usernameIconLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PageOn() {

    }
}
