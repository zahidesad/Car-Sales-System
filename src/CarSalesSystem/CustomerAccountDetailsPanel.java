package CarSalesSystem;

import JPA_Classes.*;
import CorePackage.ITriggerer;
import Main.MainFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zahid
 */
public class CustomerAccountDetailsPanel extends javax.swing.JPanel implements ITriggerer {

    private JPanel previousPanel;
    public Customer customer;

    public CustomerAccountDetailsPanel() {
        initComponents();
    }

    public void accountDetailsForDealer() {
        deleteAccountButton.setVisible(false);
        previousPanel = MainFrame.instance.getDealerControlPanel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myAccountLabel = new javax.swing.JLabel();
        backButton = new SwingComponents.Button();
        customerIDLabel = new SwingComponents.Label();
        nameLabel = new SwingComponents.Label();
        usernameLabel = new SwingComponents.Label();
        phoneNoLabel = new SwingComponents.Label();
        emailLabel = new SwingComponents.Label();
        customerIDInformationLabel = new SwingComponents.Label();
        nameInformationLabel = new SwingComponents.Label();
        usernameInformationLabel = new SwingComponents.Label();
        phoneNoInformationLabel = new SwingComponents.Label();
        emailInformationLabel = new SwingComponents.Label();
        deleteAccountButton = new SwingComponents.Button();
        changePasswordButton = new SwingComponents.Button();
        editAccountButton = new SwingComponents.Button();

        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(900, 529));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myAccountLabel.setBackground(new java.awt.Color(102, 102, 102));
        myAccountLabel.setFont(new java.awt.Font("SansSerif", 2, 48)); // NOI18N
        myAccountLabel.setForeground(new java.awt.Color(0, 0, 0));
        myAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myAccountLabel.setText("MY ACCOUNT");
        myAccountLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(myAccountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 470, 60));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackArrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        customerIDLabel.setBackground(new java.awt.Color(153, 153, 153));
        customerIDLabel.setForeground(new java.awt.Color(0, 0, 0));
        customerIDLabel.setText("Customer ID :");
        customerIDLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(customerIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 210, 50));

        nameLabel.setBackground(new java.awt.Color(153, 153, 153));
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Name : ");
        nameLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 210, 50));

        usernameLabel.setBackground(new java.awt.Color(153, 153, 153));
        usernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabel.setText("Username : ");
        usernameLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 210, 50));

        phoneNoLabel.setBackground(new java.awt.Color(153, 153, 153));
        phoneNoLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneNoLabel.setText("Phone No : ");
        phoneNoLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(phoneNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 210, 50));

        emailLabel.setBackground(new java.awt.Color(153, 153, 153));
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("E-mail : ");
        emailLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 210, 50));

        customerIDInformationLabel.setBackground(new java.awt.Color(153, 153, 153));
        customerIDInformationLabel.setForeground(new java.awt.Color(0, 0, 0));
        customerIDInformationLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        add(customerIDInformationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 350, 50));

        nameInformationLabel.setBackground(new java.awt.Color(153, 153, 153));
        nameInformationLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameInformationLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        add(nameInformationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 350, 50));

        usernameInformationLabel.setBackground(new java.awt.Color(153, 153, 153));
        usernameInformationLabel.setForeground(new java.awt.Color(0, 0, 0));
        usernameInformationLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        add(usernameInformationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 350, 50));

        phoneNoInformationLabel.setBackground(new java.awt.Color(153, 153, 153));
        phoneNoInformationLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneNoInformationLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        add(phoneNoInformationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 350, 50));

        emailInformationLabel.setBackground(new java.awt.Color(153, 153, 153));
        emailInformationLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailInformationLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        add(emailInformationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 350, 50));

        deleteAccountButton.setBackground(new java.awt.Color(102, 102, 102));
        deleteAccountButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteAccountButton.setText("Delete Account");
        deleteAccountButton.setFont(new java.awt.Font("Stencil", 2, 14)); // NOI18N
        deleteAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountButtonActionPerformed(evt);
            }
        });
        add(deleteAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 140, 40));

        changePasswordButton.setBackground(new java.awt.Color(102, 102, 102));
        changePasswordButton.setForeground(new java.awt.Color(0, 0, 0));
        changePasswordButton.setText("Change Password");
        changePasswordButton.setFont(new java.awt.Font("Stencil", 2, 14)); // NOI18N
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });
        add(changePasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 170, 40));

        editAccountButton.setBackground(new java.awt.Color(102, 102, 102));
        editAccountButton.setForeground(new java.awt.Color(0, 0, 0));
        editAccountButton.setText("EDIT  ACCOUNT");
        editAccountButton.setFont(new java.awt.Font("Stencil", 2, 14)); // NOI18N
        editAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAccountButtonActionPerformed(evt);
            }
        });
        add(editAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        customer = null;
        MainFrame.instance.setPage(previousPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountButtonActionPerformed
        if ((JOptionPane.showConfirmDialog(this, "Do you really want to delete your account? "
                + "This action cannot be undone!", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
            customer.deleteAccount();
            MainFrame.instance.logOut();
            customer = null;
        }

    }//GEN-LAST:event_deleteAccountButtonActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getCustomerChangePasswordPanel());
        customer = null;
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void editAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAccountButtonActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getCustomerEditAccountDetailsPanel());
        customer = null;
    }//GEN-LAST:event_editAccountButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button backButton;
    private SwingComponents.Button changePasswordButton;
    private SwingComponents.Label customerIDInformationLabel;
    private SwingComponents.Label customerIDLabel;
    private SwingComponents.Button deleteAccountButton;
    private SwingComponents.Button editAccountButton;
    private SwingComponents.Label emailInformationLabel;
    private SwingComponents.Label emailLabel;
    private javax.swing.JLabel myAccountLabel;
    private SwingComponents.Label nameInformationLabel;
    private SwingComponents.Label nameLabel;
    private SwingComponents.Label phoneNoInformationLabel;
    private SwingComponents.Label phoneNoLabel;
    private SwingComponents.Label usernameInformationLabel;
    private SwingComponents.Label usernameLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PageOn() {

        if (customer == null) {
            customer = (Customer) MainFrame.instance.getAccount();
            previousPanel = MainFrame.instance.getCustomerControlPanel();
            deleteAccountButton.setVisible(true);
        }

        customerIDInformationLabel.setText(customer.getId() + "");
        nameInformationLabel.setText(customer.getName());
        usernameInformationLabel.setText(customer.getUsername());
        phoneNoInformationLabel.setText(customer.getPhone()+"");
        emailInformationLabel.setText(customer.getEmail());
    }
}
