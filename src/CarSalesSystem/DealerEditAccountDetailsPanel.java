package CarSalesSystem;

import CorePackage.ITriggerer;
import JPA_Classes.*;
import Main.MainFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class DealerEditAccountDetailsPanel extends javax.swing.JPanel implements ITriggerer {

    public Dealer dealer;

    private boolean flagForName = false;
    private boolean flagForUsername = false;
    private boolean flagForEmail = false;
    private boolean flagForPhoneNo = false;

    public DealerEditAccountDetailsPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myAccountLabel = new javax.swing.JLabel();
        nameLabel = new SwingComponents.Label();
        usernameLabel = new SwingComponents.Label();
        phoneNoLabel = new SwingComponents.Label();
        emailLabel = new SwingComponents.Label();
        txtUsername = new SwingComponents.TextField();
        txtPhoneNo = new SwingComponents.TextField();
        txtEmail = new SwingComponents.TextField();
        txtName = new SwingComponents.TextField();
        nameIconLabel = new javax.swing.JLabel();
        usernameIconLabel = new javax.swing.JLabel();
        emailIconLabel = new javax.swing.JLabel();
        phoneNoIconLabel = new javax.swing.JLabel();
        updateButton = new SwingComponents.Button();
        backButton = new SwingComponents.Button();

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

        nameLabel.setBackground(new java.awt.Color(153, 153, 153));
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Name : ");
        nameLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 210, 50));

        usernameLabel.setBackground(new java.awt.Color(153, 153, 153));
        usernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabel.setText("Username : ");
        usernameLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 210, 50));

        phoneNoLabel.setBackground(new java.awt.Color(153, 153, 153));
        phoneNoLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneNoLabel.setText("Phone No : ");
        phoneNoLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(phoneNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 210, 50));

        emailLabel.setBackground(new java.awt.Color(153, 153, 153));
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("E-mail : ");
        emailLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 210, 50));

        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 370, 50));

        txtPhoneNo.setForeground(new java.awt.Color(0, 0, 0));
        txtPhoneNo.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        txtPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNoKeyReleased(evt);
            }
        });
        add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 370, 50));

        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 370, 50));

        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 370, 50));
        add(nameIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 50, 50));
        add(usernameIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 50, 50));
        add(emailIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 50, 50));
        add(phoneNoIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 50, 50));

        updateButton.setBackground(new java.awt.Color(102, 102, 102));
        updateButton.setForeground(new java.awt.Color(0, 0, 0));
        updateButton.setText("Update Account DEtails");
        updateButton.setFont(new java.awt.Font("Stencil", 2, 14)); // NOI18N
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 210, 50));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackArrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (txtName.getText().equals("") || txtUsername.getText().equals("")
                || txtPhoneNo.getText().equals("") || txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Fill All Entries.",
                    "Failure", JOptionPane.ERROR_MESSAGE);

            return;

        } else if (flagForName == true && flagForUsername == true && flagForPhoneNo == true && flagForEmail == true) {
            if ((JOptionPane.showConfirmDialog(this, "Do you really want to change the informations of this acount? This action cannot be undone! ",
                    "Are You Sure ?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {

                dealer.setName(txtName.getText());
                dealer.setUsername(txtUsername.getText());
                dealer.setPhone(Integer.parseInt(txtPhoneNo.getText()));
                dealer.setEmail(txtEmail.getText());

                Database.updateInformation(dealer);

                MainFrame.instance.setPage(MainFrame.instance.getDealerControlPanel());
                dealer = null;

                JOptionPane.showMessageDialog(this, "Account informations successfully updated ",
                        "Operation Successful", JOptionPane.INFORMATION_MESSAGE);

                txtName.setText("");
                txtUsername.setText("");
                txtEmail.setText("");
                txtPhoneNo.setText("");

                nameIconLabel.setIcon(null);
                usernameIconLabel.setIcon(null);
                emailIconLabel.setIcon(null);
                phoneNoIconLabel.setIcon(null);

                dealer = null;
                MainFrame.instance.setPage(MainFrame.instance.getDealerControlPanel());

            }

        } else {
            JOptionPane.showMessageDialog(this, "There was a validation error, please enter only a letter"
                    + " for the model and color, and a maximum of 9 digits for the price.",
                    "Validation Error Occured.", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if ((JOptionPane.showConfirmDialog(this, "If you go back, your changes will not be saved. "
                + "Do you really want to go back?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
            dealer = null;
            MainFrame.instance.setPage(MainFrame.instance.getDealerAccountDetailsPanel());
        } else {

        }

    }//GEN-LAST:event_backButtonActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        String name = txtName.getText();

        String regex = "^" //metnin başlangıcını belirtir.
                + "[A-Za-z]" // büyük veya küçük harflerin herhangi birinin eşleşebileceğini belirtir.
                + "{2,20}" // önceki karakter setinin 2 ile 20 arasında kez tekrarlanabileceğini belirtir.
                + "$"; //metnin sonunu belirtir.
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);

        if (matcher.matches()) {
            ImageIcon verifiedIcon = new ImageIcon(getClass().getResource("/images/verifiedIcon.png"));
            nameIconLabel.setIcon(verifiedIcon);
            flagForName = true;
        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon(getClass().getResource("/images/nonVerifiedIcon.png"));
            nameIconLabel.setIcon(nonVerifiedIcon);
            flagForName = false;
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        String username = txtUsername.getText();

        String regex = "^" //Satırın başlangıcını belirtir
                + "[A-Za-z]" // En az bir harf karakteri ile başlamalıdır
                + "\\w{3,29}" //3 ila 29 karakter uzunluğunda bir kelime karakteri (\w) dizisi (word character)olmalıdır.
                + "$"; // Satırın sonunu belirtir
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

        if (matcher.matches()) {
            ImageIcon verifiedIcon = new ImageIcon(getClass().getResource("/images/verifiedIcon.png"));
            usernameIconLabel.setIcon(verifiedIcon);
            flagForUsername = true;
        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon(getClass().getResource("/images/nonVerifiedIcon.png"));
            usernameIconLabel.setIcon(nonVerifiedIcon);
            flagForUsername = false;
        }
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtPhoneNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNoKeyReleased
        String phoneNo = txtPhoneNo.getText();
        String regex = "\\b\\d{9}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNo);

        if (matcher.matches()) {
            ImageIcon verifiedIcon = new ImageIcon(getClass().getResource("/images/verifiedIcon.png"));
            phoneNoIconLabel.setIcon(verifiedIcon);
            flagForPhoneNo = true;
        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon(getClass().getResource("/images/nonVerifiedIcon.png"));
            phoneNoIconLabel.setIcon(nonVerifiedIcon);
            flagForPhoneNo = false;
        }
    }//GEN-LAST:event_txtPhoneNoKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        String email = txtEmail.getText();

        String regex = "^" //işareti, metnin başlangıcını belirtir.
                + "[A-Za-z0-9+_.-]+" //  e-posta adresinin kullanıcı adını belirten bölümü ifade eder. 
                //Burada, büyük/küçük harf ve rakamlardan oluşan karakterlerin yanı sıra, "+" ve "", "." ve "-" 
                //karakterleri de kullanılabilir. "+" karakteri, kullanıcı adının sonunda kullanıldığında özellikle 
                //yaygın bir şekilde kullanılır ve çeşitli e-posta servisleri tarafından desteklenir.
                + "@" //e-posta adresinin kullanıcı adı ve etki alanı arasındaki ayırıcıdır.
                + "(.+)" //ifadesi, e-posta adresinin etki alanını belirtir. Burada, parantez içindeki nokta karakteri, 
                //herhangi bir karakteri eşleştirir ve "+" işareti, bu karakterin bir veya daha fazla kez tekrarlanabileceğini belirtir.
                + "$"; // metnin sonunu belirtir.
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            ImageIcon verifiedIcon = new ImageIcon(getClass().getResource("/images/verifiedIcon.png"));
            emailIconLabel.setIcon(verifiedIcon);
            flagForEmail = true;
        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon(getClass().getResource("/images/nonVerifiedIcon.png"));
            emailIconLabel.setIcon(nonVerifiedIcon);
            flagForEmail = false;
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    @Override
    public void PageOn() {
        if (dealer == null) {
            dealer = (Dealer) MainFrame.instance.getAccount();

        }
        ImageIcon verifiedIcon = new ImageIcon(getClass().getResource("/images/verifiedIcon.png"));

        flagForName = true;
        flagForUsername = true;
        flagForEmail = true;
        flagForPhoneNo = true;

        txtName.setText(dealer.getName());
        txtUsername.setText(dealer.getUsername());
        txtEmail.setText(dealer.getEmail());
        txtPhoneNo.setText(dealer.getPhone() + "");

        nameIconLabel.setIcon(verifiedIcon);
        usernameIconLabel.setIcon(verifiedIcon);
        emailIconLabel.setIcon(verifiedIcon);
        phoneNoIconLabel.setIcon(verifiedIcon);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button backButton;
    private javax.swing.JLabel emailIconLabel;
    private SwingComponents.Label emailLabel;
    private javax.swing.JLabel myAccountLabel;
    private javax.swing.JLabel nameIconLabel;
    private SwingComponents.Label nameLabel;
    private javax.swing.JLabel phoneNoIconLabel;
    private SwingComponents.Label phoneNoLabel;
    private SwingComponents.TextField txtEmail;
    private SwingComponents.TextField txtName;
    private SwingComponents.TextField txtPhoneNo;
    private SwingComponents.TextField txtUsername;
    private SwingComponents.Button updateButton;
    private javax.swing.JLabel usernameIconLabel;
    private SwingComponents.Label usernameLabel;
    // End of variables declaration//GEN-END:variables
}
