package CarSalesSystem;

import CorePackage.ITriggerer;
import Main.MainFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class DealerControlPanel extends javax.swing.JPanel implements ITriggerer {

    public DealerControlPanel() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dealerControlPanelLabel = new javax.swing.JLabel();
        backButton = new SwingComponents.Button();
        manageVehiclesButton = new SwingComponents.Button();
        customerRequestsButton = new SwingComponents.Button();
        myAccountButton = new SwingComponents.Button();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(900, 529));
        setPreferredSize(new java.awt.Dimension(900, 529));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dealerControlPanelLabel.setBackground(new java.awt.Color(102, 102, 102));
        dealerControlPanelLabel.setFont(new java.awt.Font("SansSerif", 2, 48)); // NOI18N
        dealerControlPanelLabel.setForeground(new java.awt.Color(0, 0, 0));
        dealerControlPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dealerControlPanelLabel.setText("DEALER CONTROL PANEL");
        dealerControlPanelLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(dealerControlPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 660, 60));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackArrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        manageVehiclesButton.setBackground(new java.awt.Color(204, 204, 204));
        manageVehiclesButton.setForeground(new java.awt.Color(0, 0, 0));
        manageVehiclesButton.setText("MANAGE VEHICLES");
        manageVehiclesButton.setFont(new java.awt.Font("Stencil", 2, 24)); // NOI18N
        manageVehiclesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVehiclesButtonActionPerformed(evt);
            }
        });
        add(manageVehiclesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 310, 100));

        customerRequestsButton.setBackground(new java.awt.Color(204, 204, 204));
        customerRequestsButton.setForeground(new java.awt.Color(0, 0, 0));
        customerRequestsButton.setText("CUSTOMER REQUESTS");
        customerRequestsButton.setFont(new java.awt.Font("Stencil", 2, 24)); // NOI18N
        customerRequestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerRequestsButtonActionPerformed(evt);
            }
        });
        add(customerRequestsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 310, 100));

        myAccountButton.setBackground(new java.awt.Color(204, 204, 204));
        myAccountButton.setForeground(new java.awt.Color(0, 0, 0));
        myAccountButton.setText("MY ACCOUNT");
        myAccountButton.setFont(new java.awt.Font("Stencil", 2, 24)); // NOI18N
        myAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myAccountButtonActionPerformed(evt);
            }
        });
        add(myAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 330, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("WELCOME DEALER");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if ((JOptionPane.showConfirmDialog(this, "Do You Want To Log Out?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
            MainFrame.instance.logOut();
        } else {

        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void myAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAccountButtonActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getDealerAccountDetailsPanel());
    }//GEN-LAST:event_myAccountButtonActionPerformed

    private void manageVehiclesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVehiclesButtonActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getDealerManageVehiclePanel());
    }//GEN-LAST:event_manageVehiclesButtonActionPerformed

    private void customerRequestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerRequestsButtonActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getDealerCustomerRequestsPanel());
    }//GEN-LAST:event_customerRequestsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button backButton;
    private SwingComponents.Button customerRequestsButton;
    private javax.swing.JLabel dealerControlPanelLabel;
    private javax.swing.JLabel jLabel1;
    private SwingComponents.Button manageVehiclesButton;
    private SwingComponents.Button myAccountButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PageOn() {
        jLabel1.setText("Welcome " + MainFrame.instance.getAccount().getName());
    }
}
