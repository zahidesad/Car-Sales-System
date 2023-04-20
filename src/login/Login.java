package login;

import CorePackage.*;
import Main.MainFrame;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class Login extends PanelCustom implements ITriggerer {

    private boolean flagForUsername = false;
    private boolean flagForPassword = false;

    public Login() {
        initComponents();
        setAlpha(1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsername = new SwingComponents.TextField();
        txtPassword = new SwingComponents.Password();
        signInButton = new SwingComponents.Button();
        usernameIconLabel = new javax.swing.JLabel();
        passwordIconLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 76, 76));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN IN");

        txtUsername.setForeground(new java.awt.Color(76, 76, 76));
        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtUsername.setHint("USERNAME");
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });

        txtPassword.setForeground(new java.awt.Color(76, 76, 76));
        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPassword.setHint("PASSWORD");
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

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
                        .addGap(46, 46, 46)
                        .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(passwordIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addContainerGap(0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed

        String password = String.valueOf(txtPassword.getPassword());

        if (flagForUsername == true && flagForPassword == true) {
            User account = Database.loginVerification(txtUsername.getText(), password);

            if (account == null) {
                JOptionPane.showMessageDialog(this, "This user does not exist!",
                        "User Not Found", JOptionPane.ERROR_MESSAGE);
            } else if (account instanceof Admin) {
                MainFrame.instance.setAccount(account);
                MainFrame.instance.setPage(MainFrame.instance.getAdminControlPanel());

                txtUsername.setText("");
                txtPassword.setText("");
                usernameIconLabel.setIcon(null);
                passwordIconLabel.setIcon(null);
            } else if (account instanceof Customer) {
                MainFrame.instance.setAccount(account);
                MainFrame.instance.setPage(MainFrame.instance.getCustomerControlPanel());

                txtUsername.setText("");
                txtPassword.setText("");
                usernameIconLabel.setIcon(null);
                passwordIconLabel.setIcon(null);
            } else if (account instanceof Dealer) {
                MainFrame.instance.setAccount(account);
                MainFrame.instance.setPage(MainFrame.instance.getDealerControlPanel());

                txtUsername.setText("");
                txtPassword.setText("");
                usernameIconLabel.setIcon(null);
                passwordIconLabel.setIcon(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "A validation error has occurred. "
                    + "Please check the validation rules from the menu at the bottom right.",
                    "The Gaps Were Not Filled As Desired.", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_signInButtonActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel passwordIconLabel;
    private SwingComponents.Button signInButton;
    private SwingComponents.Password txtPassword;
    private SwingComponents.TextField txtUsername;
    private javax.swing.JLabel usernameIconLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PageOn() {

    }
}
