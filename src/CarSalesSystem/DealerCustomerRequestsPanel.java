package CarSalesSystem;

import Main.MainFrame;
import SwingComponents.EventLogin;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zahid
 */
public class DealerCustomerRequestsPanel extends javax.swing.JPanel {

    private EventLogin event;

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columNames = {"Customer ID", "Customer Username", "Vehicle ID", "Vehicle Brand", "Vehicle Model", "Price", "Status"};

    public DealerCustomerRequestsPanel() {
        initComponents();
        tableModel.setColumnIdentifiers(columNames);
        tableDark1.setModel(tableModel);
        refreshTable();
    }

    public void setEventLogin(EventLogin event) {
        this.event = event;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myCustomersLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new SwingComponents.TableDark();
        backButton = new SwingComponents.Button();
        customerInfoButton = new SwingComponents.Button();
        acceptDennyButton = new SwingComponents.Button();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myCustomersLabel.setBackground(new java.awt.Color(102, 102, 102));
        myCustomersLabel.setFont(new java.awt.Font("SansSerif", 2, 48)); // NOI18N
        myCustomersLabel.setForeground(new java.awt.Color(0, 0, 0));
        myCustomersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myCustomersLabel.setText("MY CUSTOMERS");
        myCustomersLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(myCustomersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 490, 60));

        tableDark1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Customer Username", "Vehicle ID", "Vehicle Brand", "Vehicle Model", "Price ", "Status"
            }
        ));
        tableDark1.setPreferredSize(new java.awt.Dimension(300, 270));
        jScrollPane1.setViewportView(tableDark1);
        if (tableDark1.getColumnModel().getColumnCount() > 0) {
            tableDark1.getColumnModel().getColumn(0).setPreferredWidth(35);
            tableDark1.getColumnModel().getColumn(1).setPreferredWidth(90);
            tableDark1.getColumnModel().getColumn(2).setPreferredWidth(30);
            tableDark1.getColumnModel().getColumn(3).setPreferredWidth(65);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 860, 330));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackArrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        customerInfoButton.setBackground(new java.awt.Color(0, 0, 0));
        customerInfoButton.setForeground(new java.awt.Color(255, 255, 255));
        customerInfoButton.setText("Customer Info");
        customerInfoButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        add(customerInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 470, 180, -1));

        acceptDennyButton.setBackground(new java.awt.Color(0, 0, 0));
        acceptDennyButton.setForeground(new java.awt.Color(255, 255, 255));
        acceptDennyButton.setText("Accept / Deny");
        acceptDennyButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        add(acceptDennyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void refreshTable() {
        tableModel.setRowCount(0);
        tableModel.setColumnIdentifiers(columNames);
    }


    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame.event.setPage(MainFrame.dealerControlPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button acceptDennyButton;
    private SwingComponents.Button backButton;
    private SwingComponents.Button customerInfoButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel myCustomersLabel;
    private SwingComponents.TableDark tableDark1;
    // End of variables declaration//GEN-END:variables
}
