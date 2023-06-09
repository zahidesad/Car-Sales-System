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
public class DealerCustomerRequestsPanel extends javax.swing.JPanel implements ITriggerer {

    private Dealer dealer;

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columNames = {"Customer ID", "Customer Username", "Sale ID", "Car Brand", "Car Model", "Price", "Status"};

    public DealerCustomerRequestsPanel() {
        initComponents();
        tableModel.setColumnIdentifiers(columNames);
        tableDark1.setModel(tableModel);

    }

    public void refreshTable() {
        tableModel.setRowCount(0);
        tableModel.setColumnIdentifiers(columNames);

        for (Sales sale : dealer.getSalesList()) {
            if (sale.getStatus().equals(Sales.PENDING)) {

                Vector rowData = new Vector();
                rowData.add(sale.getCustomerId().getId());
                rowData.add(sale.getCustomerId().getUsername());
                rowData.add(sale.getId());
                rowData.add(sale.getCarId().getBrand());
                rowData.add(sale.getCarId().getModel());
                rowData.add(sale.getCarId().getPrice());
                rowData.add(sale.getStatus());

                tableModel.addRow(rowData);
            }

        }

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
        setMinimumSize(new java.awt.Dimension(900, 529));
        setPreferredSize(new java.awt.Dimension(900, 529));
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
                "Customer ID", "Customer Username", "Car ID", "Car Brand", "Car Model", "Price ", "Status"
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
        customerInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerInfoButtonActionPerformed(evt);
            }
        });
        add(customerInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 470, 180, -1));

        acceptDennyButton.setBackground(new java.awt.Color(0, 0, 0));
        acceptDennyButton.setForeground(new java.awt.Color(255, 255, 255));
        acceptDennyButton.setText("Accept / Deny");
        acceptDennyButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        acceptDennyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptDennyButtonActionPerformed(evt);
            }
        });
        add(acceptDennyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 200, -1));
    }// </editor-fold>//GEN-END:initComponents


    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getDealerControlPanel());
    }//GEN-LAST:event_backButtonActionPerformed

    private void customerInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerInfoButtonActionPerformed

        try {
            for (Users user : Database.getUsers()) {
                Users customer = Database.findUserByID((Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 0));

                MainFrame.instance.getCustomerAccountDetailsPanel().customer = (Customer) customer;
                MainFrame.instance.getCustomerAccountDetailsPanel().accountDetailsForDealer();
                MainFrame.instance.setPage(MainFrame.instance.getCustomerAccountDetailsPanel());

            }

        } catch (IndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(this, "No Data Selected from the Table. ",
                    "Selection Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_customerInfoButtonActionPerformed

    private void acceptDennyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptDennyButtonActionPerformed
        String[] options = {"Accept", "Deny", "Cancel"};
        int selection = JOptionPane.showOptionDialog(this, "Do You Want To Accept Offer?", "Sales Process",
                0, 3, null, options, options[2]);
        try {
            if (tableDark1.getValueAt(tableDark1.getSelectedRow(), 6).equals(Sales.PENDING)) {
                switch (selection) {
                    case 0:
                        Database.acceptRequest((Integer) tableDark1.getValueAt(tableDark1.getSelectedRow(), 2));
                        dealer = (Dealer) Database.findUserByID(dealer.getId());
                        MainFrame.instance.setAccount(dealer);
                        refreshTable();
                        break;
                    case 1:
                        Database.denyRequest((Integer) tableDark1.getValueAt(tableDark1.getSelectedRow(), 2));
                        dealer = (Dealer) Database.findUserByID(dealer.getId());
                        MainFrame.instance.setAccount(dealer);
                        refreshTable();
                        break;
                    default:
                        break;
                }
            }
        } catch (IndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(this, "No Data Selected from the Table. ",
                    "Selection Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_acceptDennyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button acceptDennyButton;
    private SwingComponents.Button backButton;
    private SwingComponents.Button customerInfoButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel myCustomersLabel;
    private SwingComponents.TableDark tableDark1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PageOn() {
        dealer = (Dealer) MainFrame.instance.getAccount();
        refreshTable();
    }
}
