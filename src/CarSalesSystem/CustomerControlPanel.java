package CarSalesSystem;

import Main.MainFrame;
import SwingComponents.EventLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class CustomerControlPanel extends javax.swing.JPanel {
    
    private EventLogin event;
    
    private CustomerVehicleListPanel customerVehicleListPanel;
    private CustomerMyOrdersPanel customerMyOrdersPanel;
    private CustomerAccountDetailsPanel customerAccountDetailsPanel;
    
    public CustomerControlPanel() {
        initComponents();
        customerVehicleListPanel = new CustomerVehicleListPanel();
        customerVehicleListPanel.setEventLogin(MainFrame.event);
        
        customerMyOrdersPanel = new CustomerMyOrdersPanel();
        customerMyOrdersPanel.setEventLogin(event);
        
        customerAccountDetailsPanel = new CustomerAccountDetailsPanel();
        customerAccountDetailsPanel.setEventLogin(event);
    }
    
    public void setEventLogin(EventLogin event) {
        this.event = event;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerControlPanelLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        viewVehiclesButton = new SwingComponents.Button();
        myOrdersButton = new SwingComponents.Button();
        myAccountButton = new SwingComponents.Button();
        backButton = new SwingComponents.Button();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customerControlPanelLabel.setBackground(new java.awt.Color(102, 102, 102));
        customerControlPanelLabel.setFont(new java.awt.Font("SansSerif", 2, 48)); // NOI18N
        customerControlPanelLabel.setForeground(new java.awt.Color(0, 0, 0));
        customerControlPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerControlPanelLabel.setText("CUSTOMER CONTROL PANEL");
        customerControlPanelLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(customerControlPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 740, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("WELCOME");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 210, 30));

        viewVehiclesButton.setBackground(new java.awt.Color(204, 204, 204));
        viewVehiclesButton.setForeground(new java.awt.Color(0, 0, 0));
        viewVehiclesButton.setText("VIEW VEHICLES");
        viewVehiclesButton.setFont(new java.awt.Font("Stencil", 2, 24)); // NOI18N
        viewVehiclesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVehiclesButtonActionPerformed(evt);
            }
        });
        add(viewVehiclesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 310, 100));

        myOrdersButton.setBackground(new java.awt.Color(204, 204, 204));
        myOrdersButton.setForeground(new java.awt.Color(0, 0, 0));
        myOrdersButton.setText("my orders");
        myOrdersButton.setFont(new java.awt.Font("Stencil", 2, 24)); // NOI18N
        myOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myOrdersButtonActionPerformed(evt);
            }
        });
        add(myOrdersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 310, 100));

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

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackArrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewVehiclesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVehiclesButtonActionPerformed
        MainFrame.event.setPage(customerVehicleListPanel);
    }//GEN-LAST:event_viewVehiclesButtonActionPerformed

    private void myOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myOrdersButtonActionPerformed
        MainFrame.event.setPage(customerMyOrdersPanel);
    }//GEN-LAST:event_myOrdersButtonActionPerformed

    private void myAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAccountButtonActionPerformed
        MainFrame.event.setPage(customerAccountDetailsPanel);
    }//GEN-LAST:event_myAccountButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if ((JOptionPane.showConfirmDialog(this, "Do You Want To Log Out?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
            MainFrame.event.logOut();
        } else {
            
        }
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button backButton;
    private javax.swing.JLabel customerControlPanelLabel;
    private javax.swing.JLabel jLabel1;
    private SwingComponents.Button myAccountButton;
    private SwingComponents.Button myOrdersButton;
    private SwingComponents.Button viewVehiclesButton;
    // End of variables declaration//GEN-END:variables
}
