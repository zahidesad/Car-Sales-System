package login;

import CarSalesSystem.AdminControlPanel;
import CarSalesSystem.DealerControlPanel;

import CorePackage.*;
import Main.MainFrame;
import SwingComponents.EventLogin;
import com.sun.tools.javac.Main;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class Login extends PanelCustom {

    /**
     * Creates new form Login
     */
    private EventLogin event;
    private AdminControlPanel adminControlPanel;
    private DealerControlPanel dealerControlPanel;

    public Login() {
        initComponents();
        setAlpha(1);
        
        adminControlPanel = new AdminControlPanel();
        adminControlPanel.setEventLogin(MainFrame.event);
        
        dealerControlPanel = new DealerControlPanel();
        dealerControlPanel.setEventLogin(MainFrame.event);
    }

    public void setEventLogin(EventLogin event) {
        this.event = event;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsername = new SwingComponents.TextField();
        txtPassword = new SwingComponents.Password();
        signInButton = new SwingComponents.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 76, 76));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN IN");

        txtUsername.setForeground(new java.awt.Color(76, 76, 76));
        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtUsername.setHint("USERNAME");

        txtPassword.setForeground(new java.awt.Color(76, 76, 76));
        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPassword.setHint("PASSWORD");

        signInButton.setBackground(new java.awt.Color(86, 142, 255));
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setText("SIGN IN");
        signInButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed


        String password = String.valueOf(txtPassword.getPassword());
        User account = Database.loginVerification(txtUsername.getText(), password);

        if (account == null) {
            JOptionPane.showMessageDialog(this, "This user does not exist!",
                    "User Not Found", JOptionPane.ERROR_MESSAGE);
        } else if (account instanceof Admin) {
            MainFrame.account = account;
            event.setPage(adminControlPanel);
        } else if (account instanceof Customer) {
            MainFrame.account = account;

        } else if (account instanceof Dealer) {
            MainFrame.account = account;
            event.setPage(dealerControlPanel);

        }
    }//GEN-LAST:event_signInButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private SwingComponents.Button signInButton;
    private SwingComponents.Password txtPassword;
    private SwingComponents.TextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
