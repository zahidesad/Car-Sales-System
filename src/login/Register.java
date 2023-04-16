package login;

import CorePackage.Customer;
import CorePackage.Database;
import CorePackage.Dealer;
import CorePackage.ITriggerer;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class Register extends PanelCustom implements ITriggerer{

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmail1 = new SwingComponents.TextField();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new SwingComponents.TextField();
        txtUsername = new SwingComponents.TextField();
        txtPassword = new SwingComponents.Password();
        registerDealerButton = new SwingComponents.Button();
        registerCustomerButton = new SwingComponents.Button();
        txtPhoneNumber = new SwingComponents.TextField();
        txtName = new SwingComponents.TextField();

        txtEmail1.setForeground(new java.awt.Color(242, 242, 242));
        txtEmail1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEmail1.setHint("E-MAIL");

        setBackground(new java.awt.Color(53, 53, 53));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 243, 243));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP");

        txtEmail.setForeground(new java.awt.Color(242, 242, 242));
        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEmail.setHint("E-MAIL");

        txtUsername.setForeground(new java.awt.Color(242, 242, 242));
        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtUsername.setHint("USERNAME");

        txtPassword.setForeground(new java.awt.Color(242, 242, 242));
        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPassword.setHint("PASSWORD");

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

        txtName.setForeground(new java.awt.Color(242, 242, 242));
        txtName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtName.setHint("NAME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
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
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
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

        } else {
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

        } else {
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

        }
                                       
    }//GEN-LAST:event_registerCustomerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private SwingComponents.Button registerCustomerButton;
    private SwingComponents.Button registerDealerButton;
    private SwingComponents.TextField txtEmail;
    private SwingComponents.TextField txtEmail1;
    private SwingComponents.TextField txtName;
    private SwingComponents.Password txtPassword;
    private SwingComponents.TextField txtPhoneNumber;
    private SwingComponents.TextField txtUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PageOn() {
        
    }
}
