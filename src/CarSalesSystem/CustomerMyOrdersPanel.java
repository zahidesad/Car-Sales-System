package CarSalesSystem;

import Main.MainFrame;
import SwingComponents.EventLogin;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zahid
 */
public class CustomerMyOrdersPanel extends javax.swing.JPanel {

    private EventLogin event;

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columNames = {"Dealer ID", "Name", "Vehicle ID", "Vehicle Brand", "Vehicle Model", "Price", "Status"};

    public CustomerMyOrdersPanel() {
        initComponents();

        tableModel.setColumnIdentifiers(columNames);
        tableDark1.setModel(tableModel);
    }

    public void setEventLogin(EventLogin event) {
        this.event = event;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myOrdersLabel = new javax.swing.JLabel();
        backButton = new SwingComponents.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new SwingComponents.TableDark();
        dealerInfoButton = new SwingComponents.Button();
        cancelOrderButton = new SwingComponents.Button();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myOrdersLabel.setBackground(new java.awt.Color(102, 102, 102));
        myOrdersLabel.setFont(new java.awt.Font("SansSerif", 2, 48)); // NOI18N
        myOrdersLabel.setForeground(new java.awt.Color(0, 0, 0));
        myOrdersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myOrdersLabel.setText("MY ORDERS");
        myOrdersLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(myOrdersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 490, 60));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackArrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tableDark1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableDark1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 840, 330));

        dealerInfoButton.setBackground(new java.awt.Color(0, 0, 0));
        dealerInfoButton.setForeground(new java.awt.Color(255, 255, 255));
        dealerInfoButton.setText("Dealer Info");
        dealerInfoButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        add(dealerInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 180, -1));

        cancelOrderButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelOrderButton.setText("Cancel Order");
        cancelOrderButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        add(cancelOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame.event.setPage(MainFrame.customerControlPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button backButton;
    private SwingComponents.Button cancelOrderButton;
    private SwingComponents.Button dealerInfoButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel myOrdersLabel;
    private SwingComponents.TableDark tableDark1;
    // End of variables declaration//GEN-END:variables
}
