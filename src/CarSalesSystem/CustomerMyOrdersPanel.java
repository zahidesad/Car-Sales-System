package CarSalesSystem;

import JPA_Classes.*;
import CorePackage.ITriggerer;
import Main.MainFrame;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zahid
 */
public class CustomerMyOrdersPanel extends javax.swing.JPanel implements ITriggerer {

    private Customer customer;

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columNames = {"Dealer ID", "Name", "Sale ID", "Car Brand", "Car Model", "Price", "Status"};

    public CustomerMyOrdersPanel() {
        initComponents();

        tableModel.setColumnIdentifiers(columNames);
        tableDark1.setModel(tableModel);
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
        informationLabel = new SwingComponents.Label();

        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(900, 529));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myOrdersLabel.setBackground(new java.awt.Color(102, 102, 102));
        myOrdersLabel.setFont(new java.awt.Font("SansSerif", 2, 48)); // NOI18N
        myOrdersLabel.setForeground(new java.awt.Color(0, 0, 0));
        myOrdersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myOrdersLabel.setText("MY ORDERS");
        myOrdersLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(myOrdersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 490, 60));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 840, 330));

        dealerInfoButton.setBackground(new java.awt.Color(0, 0, 0));
        dealerInfoButton.setForeground(new java.awt.Color(255, 255, 255));
        dealerInfoButton.setText("Dealer Info");
        dealerInfoButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        dealerInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealerInfoButtonActionPerformed(evt);
            }
        });
        add(dealerInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 180, -1));

        cancelOrderButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelOrderButton.setText("Cancel Order");
        cancelOrderButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        cancelOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderButtonActionPerformed(evt);
            }
        });
        add(cancelOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 190, -1));

        informationLabel.setForeground(new java.awt.Color(255, 255, 255));
        informationLabel.setText("If you don't see your pending status vehicle in your table, the account of the dealer selling the vehicle or the vehicle itself has been deleted by the admin.");
        informationLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        add(informationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 850, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void refreshTable() {
        tableModel.setRowCount(0);
        tableModel.setColumnIdentifiers(columNames);

        for (Sales sale : customer.getSalesList()) {
            if (!sale.getStatus().equals(Sales.AVAILABLE) ) {

                Vector rowData = new Vector();
                if (sale.getDealerId() != null) {
                    rowData.add(sale.getDealerId().getId());
                } else {
                    rowData.add("Deleted Account");
                }
                if (sale.getDealerId() != null) {
                    rowData.add(sale.getDealerId().getName());
                } else {
                    rowData.add("Deleted Account");
                }
                rowData.add(sale.getId());
                rowData.add(sale.getCarId().getBrand());
                rowData.add(sale.getCarId().getModel());
                rowData.add(sale.getCarId().getPrice());
                rowData.add(sale.getStatus());

                tableModel.addRow(rowData);
            }
        }

    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getCustomerControlPanel());
    }//GEN-LAST:event_backButtonActionPerformed

    private void dealerInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealerInfoButtonActionPerformed
        try {
            for (Users user : Database.getUsers()) {
                Users dealer = Database.findUserByID((Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 0));

                MainFrame.instance.getDealerAccountDetailsPanel().dealer = (Dealer) dealer;
                MainFrame.instance.getDealerAccountDetailsPanel().accountDetailsForCustomer();
                if (dealer != null) {  // Extra control when admin deletes a dealer account or dealer deletes their own account
                    MainFrame.instance.setPage(MainFrame.instance.getDealerAccountDetailsPanel());
                } else {
                    JOptionPane.showMessageDialog(this, "This dealer account has been deleted by itself or by the admin. ",
                            "Undefined User", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            }
            return;
        } catch (IndexOutOfBoundsException e) {

            JOptionPane.showMessageDialog(this, "No Data Selected from the Table. ",
                    "Selection Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassCastException exception) {
            JOptionPane.showMessageDialog(this, "This dealer account has been deleted by itself or by the admin.",
                    "Undefined User", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_dealerInfoButtonActionPerformed

    private void cancelOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderButtonActionPerformed

        try {
            if (tableModel.getValueAt(tableDark1.getSelectedRow(), 6).equals(Sales.PENDING)) {
                if ((JOptionPane.showConfirmDialog(this, "Do you really want to cancel your order? "
                        + "This action cannot be undone!", "WARNING",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {

                    Database.cancelOrder((Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 2));
                    for (int i = 0; i < customer.getSalesList().size(); i++) {
                        if (customer.getSalesList().get(i).getId() == (Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 2)) {
                            customer.getSalesList().remove(i);
                        }
                    }
                    refreshTable();
                } else {

                }
            } else {
                JOptionPane.showMessageDialog(this, "This order cannot be canceled because the car "
                        + "is already in accepted or denied status.", "Invalid Transaction", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Something went wrong");
            JOptionPane.showMessageDialog(this, "No Data Selected from the Table. ",
                    "Selection Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cancelOrderButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button backButton;
    private SwingComponents.Button cancelOrderButton;
    private SwingComponents.Button dealerInfoButton;
    private SwingComponents.Label informationLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel myOrdersLabel;
    private SwingComponents.TableDark tableDark1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PageOn() {
        customer = (Customer) MainFrame.instance.getAccount();
        refreshTable();
    }
}
