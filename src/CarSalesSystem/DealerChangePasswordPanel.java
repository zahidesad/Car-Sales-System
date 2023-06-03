package CarSalesSystem;

import JPA_Classes.*;
import CorePackage.ITriggerer;
import Main.MainFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class DealerChangePasswordPanel extends javax.swing.JPanel implements ITriggerer {

    Dealer dealer;

    private boolean oldPasswordControl = false;
    private boolean newPasswordControl = false;
    private boolean flagForPassword = false;

    public DealerChangePasswordPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chancePasswordLabel = new javax.swing.JLabel();
        oldPasswordLabel = new SwingComponents.Label();
        NewPasswordLabel = new SwingComponents.Label();
        NewPasswordLabel1 = new SwingComponents.Label();
        txtNewPasswordAgain = new SwingComponents.Password();
        txtOldPassword = new SwingComponents.Password();
        txtNewPassword = new SwingComponents.Password();
        updatePasswordButton = new SwingComponents.Button();
        backButton = new SwingComponents.Button();
        oldPasswordIconLabel = new javax.swing.JLabel();
        newPasswordIconLabel = new javax.swing.JLabel();
        newPasswordAgainIconLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(900, 528));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chancePasswordLabel.setBackground(new java.awt.Color(102, 102, 102));
        chancePasswordLabel.setFont(new java.awt.Font("SansSerif", 2, 48)); // NOI18N
        chancePasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        chancePasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chancePasswordLabel.setText("CHANGE PASSWORD");
        chancePasswordLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(chancePasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 630, 60));

        oldPasswordLabel.setBackground(new java.awt.Color(153, 153, 153));
        oldPasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        oldPasswordLabel.setText("Old Password :");
        oldPasswordLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(oldPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 300, 50));

        NewPasswordLabel.setBackground(new java.awt.Color(153, 153, 153));
        NewPasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        NewPasswordLabel.setText("New Password Again :");
        NewPasswordLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(NewPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 300, 50));

        NewPasswordLabel1.setBackground(new java.awt.Color(153, 153, 153));
        NewPasswordLabel1.setForeground(new java.awt.Color(0, 0, 0));
        NewPasswordLabel1.setText("New Password :");
        NewPasswordLabel1.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(NewPasswordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 300, 50));

        txtNewPasswordAgain.setForeground(new java.awt.Color(0, 0, 0));
        txtNewPasswordAgain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPasswordAgainKeyReleased(evt);
            }
        });
        add(txtNewPasswordAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 320, 50));

        txtOldPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtOldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOldPasswordKeyReleased(evt);
            }
        });
        add(txtOldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 320, 50));

        txtNewPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyReleased(evt);
            }
        });
        add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 320, 50));

        updatePasswordButton.setBackground(new java.awt.Color(102, 102, 102));
        updatePasswordButton.setForeground(new java.awt.Color(0, 0, 0));
        updatePasswordButton.setText("Update password");
        updatePasswordButton.setFont(new java.awt.Font("Stencil", 2, 14)); // NOI18N
        updatePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePasswordButtonActionPerformed(evt);
            }
        });
        add(updatePasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 210, 50));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackArrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        add(oldPasswordIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 50, 50));
        add(newPasswordIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 50, 50));
        add(newPasswordAgainIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 50, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void updatePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePasswordButtonActionPerformed
        if (txtOldPassword.getText().equals("") || txtNewPassword.getText().equals("")
                || txtNewPasswordAgain.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Fill All Entries.",
                    "Failure", JOptionPane.ERROR_MESSAGE);

            return;

        } else if (oldPasswordControl == true && newPasswordControl == true && flagForPassword == true) {
            if (txtNewPassword.getText().equals(txtOldPassword.getText())) {
                JOptionPane.showMessageDialog(this, "Your old password cannot be the same as your new password.",
                        "Logical Error Occured. ", JOptionPane.WARNING_MESSAGE);
                return;

            } else if ((JOptionPane.showConfirmDialog(this, "Do you really want to change the password of this account? This action cannot be undone! ",
                    "Are You Sure ?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {

                Database.updatePassword(dealer.getId(), txtNewPassword.getText());

                JOptionPane.showMessageDialog(this, "Password information successfully updated ",
                        "Operation Successful", JOptionPane.INFORMATION_MESSAGE);

                txtOldPassword.setText("");
                txtNewPassword.setText("");
                txtNewPasswordAgain.setText("");

                oldPasswordIconLabel.setIcon(null);
                newPasswordIconLabel.setIcon(null);
                newPasswordAgainIconLabel.setIcon(null);

                dealer = null;
                MainFrame.instance.setPage(MainFrame.instance.getDealerControlPanel());
            }

        } else {
            JOptionPane.showMessageDialog(this, "A validation error has occurred. "
                    + "Please make sure your old password is correct and the new passwords you entered match.",
                    "Validation Error Occured.", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_updatePasswordButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if ((JOptionPane.showConfirmDialog(this, "If you go back, your changes will not be saved. "
                + "Do you really want to go back?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
            MainFrame.instance.setPage(MainFrame.instance.getDealerAccountDetailsPanel());
            dealer = null;
        } else {

        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void txtOldPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOldPasswordKeyReleased
        if (dealer.getPassword().equals(txtOldPassword.getText())) {
            ImageIcon verifiedIcon = new ImageIcon(getClass().getResource("/images/verifiedIcon.png"));
            oldPasswordIconLabel.setIcon(verifiedIcon);
            oldPasswordControl = true;
        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon(getClass().getResource("/images/nonVerifiedIcon.png"));
            oldPasswordIconLabel.setIcon(nonVerifiedIcon);
            oldPasswordControl = false;
        }

    }//GEN-LAST:event_txtOldPasswordKeyReleased

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyReleased
        String password = txtNewPassword.getText();
        String regex = "^" //Satırın başlangıcını belirtir
                + "(?=.*[0-9])" // En az bir rakam içermesi gerektiğini belirtir
                + "(?=.*[a-z])(?=.*[A-Z])" //En az bir küçük harf ve bir büyük harf içermesi gerektiğini belirtir
                + "(?=.*[@#$%^&+=])" // En az bir özel karakter içermesi gerektiğini belirtir
                + "(?=\\S+$)" // Boşluk olmadığını belirtir
                + ".{8,20}" // 8 ila 20 karakter arasında olması gerektiğini belirtir
                + "$"; // Satırın sonunu belirtir

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            ImageIcon verifiedIcon = new ImageIcon(getClass().getResource("/images/verifiedIcon.png"));
            newPasswordIconLabel.setIcon(verifiedIcon);
            flagForPassword = true;

        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon(getClass().getResource("/images/nonVerifiedIcon.png"));
            newPasswordIconLabel.setIcon(nonVerifiedIcon);
            flagForPassword = false;
        }
    }//GEN-LAST:event_txtNewPasswordKeyReleased

    private void txtNewPasswordAgainKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordAgainKeyReleased
        if (txtNewPassword.getText().equals(txtNewPasswordAgain.getText())) {
            ImageIcon verifiedIcon = new ImageIcon(getClass().getResource("/images/verifiedIcon.png"));
            newPasswordAgainIconLabel.setIcon(verifiedIcon);
            newPasswordControl = true;

        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon(getClass().getResource("/images/nonVerifiedIcon.png"));
            newPasswordAgainIconLabel.setIcon(nonVerifiedIcon);
            newPasswordControl = false;
        }
    }//GEN-LAST:event_txtNewPasswordAgainKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Label NewPasswordLabel;
    private SwingComponents.Label NewPasswordLabel1;
    private SwingComponents.Button backButton;
    private javax.swing.JLabel chancePasswordLabel;
    private javax.swing.JLabel newPasswordAgainIconLabel;
    private javax.swing.JLabel newPasswordIconLabel;
    private javax.swing.JLabel oldPasswordIconLabel;
    private SwingComponents.Label oldPasswordLabel;
    private SwingComponents.Password txtNewPassword;
    private SwingComponents.Password txtNewPasswordAgain;
    private SwingComponents.Password txtOldPassword;
    private SwingComponents.Button updatePasswordButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PageOn() {
        if (dealer == null) {
            dealer = (Dealer) MainFrame.instance.getAccount();

        }

        txtOldPassword.setText("");
        txtNewPassword.setText("");
        txtNewPasswordAgain.setText("");

        oldPasswordIconLabel.setIcon(null);
        newPasswordIconLabel.setIcon(null);
        newPasswordAgainIconLabel.setIcon(null);

        oldPasswordControl = false;
        newPasswordControl = false;
        flagForPassword = false;
    }
}
