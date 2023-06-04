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
public class DealerManageCarPanel extends javax.swing.JPanel implements ITriggerer {

    private Dealer dealer;
    public Sales searchedSales;

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columNames = {"ID", "Brand", "Model", "Type", "Color", "Year", "Price", "Status"};

    public DealerManageCarPanel() {
        initComponents();
        tableModel.setColumnIdentifiers(columNames);
        tableDark1.setModel(tableModel);

    }

    public void refreshTable() {
        tableModel.setRowCount(0);
        tableModel.setColumnIdentifiers(columNames);
        for (Sales sale : dealer.getSalesList()) {
            if (!sale.getStatus().equals(Sales.DENIED)) {
                Vector rowData = new Vector();
                rowData.add(sale.getId());
                rowData.add(sale.getCarId().getBrand());
                rowData.add(sale.getCarId().getModel());
                rowData.add(sale.getCarId().getType());
                rowData.add(sale.getCarId().getColor());
                rowData.add(sale.getCarId().getAge());
                rowData.add(sale.getCarId().getPrice());
                rowData.add(sale.getStatus());

                tableModel.addRow(rowData);
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myCarsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new SwingComponents.TableDark();
        addCarButton = new SwingComponents.Button();
        deleteCarButton = new SwingComponents.Button();
        backButton = new SwingComponents.Button();
        editCarButton = new SwingComponents.Button();

        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(900, 529));
        setPreferredSize(new java.awt.Dimension(900, 529));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myCarsLabel.setBackground(new java.awt.Color(102, 102, 102));
        myCarsLabel.setFont(new java.awt.Font("SansSerif", 2, 42)); // NOI18N
        myCarsLabel.setForeground(new java.awt.Color(0, 0, 0));
        myCarsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myCarsLabel.setText("MY CARS");
        myCarsLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(myCarsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 350, 60));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 840, 320));

        addCarButton.setBackground(new java.awt.Color(0, 0, 0));
        addCarButton.setForeground(new java.awt.Color(255, 255, 255));
        addCarButton.setText("Add Car");
        addCarButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        addCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarButtonActionPerformed(evt);
            }
        });
        add(addCarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 180, -1));

        deleteCarButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteCarButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteCarButton.setText("Delete Car");
        deleteCarButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        deleteCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCarButtonActionPerformed(evt);
            }
        });
        add(deleteCarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 180, -1));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackArrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        editCarButton.setBackground(new java.awt.Color(0, 0, 0));
        editCarButton.setForeground(new java.awt.Color(255, 255, 255));
        editCarButton.setText("Edit Car Properties");
        editCarButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        editCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCarButtonActionPerformed(evt);
            }
        });
        add(editCarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getDealerControlPanel());
    }//GEN-LAST:event_backButtonActionPerformed

    private void addCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarButtonActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getDealerAddCarPanel());
    }//GEN-LAST:event_addCarButtonActionPerformed

    private void deleteCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCarButtonActionPerformed
        try {
            if (tableModel.getValueAt(tableDark1.getSelectedRow(), 7).equals(Sales.ACCEPTED)) {
                JOptionPane.showMessageDialog(this, "This car cannot be deleted because it has been sold. ",
                        " Incorrect Operation", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (tableModel.getValueAt(tableDark1.getSelectedRow(), 7).equals(Sales.PENDING)) {
                JOptionPane.showMessageDialog(this, "This car cannot be deleted because you have not yet responded to the customer's request.\n"
                        + "Firstly, accept or deny the customer's request. You are directed to the dealer customer request panel.",
                        " Incorrect Operation", JOptionPane.INFORMATION_MESSAGE);

                MainFrame.instance.setPage(MainFrame.instance.getDealerCustomerRequestsPanel());

            } else if ((JOptionPane.showConfirmDialog(this, "Do you really want to delete this car to your account? "
                    + "This action cannot be undone!", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {

                Database.removeCar((Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 0));
                for (int i = 0; i < dealer.getSalesList().size(); i++) {
                    if (dealer.getSalesList().get(i).getId() == (Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 0)) {
                        dealer.getSalesList().remove(i);
                    }
                } 
                refreshTable();

            }

        } catch (IndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(this, "No Data Selected from the Table. ",
                    "Selection Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_deleteCarButtonActionPerformed

    private void editCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCarButtonActionPerformed
        try {
            if (tableModel.getValueAt(tableDark1.getSelectedRow(), 7).equals(Sales.ACCEPTED)) {
                JOptionPane.showMessageDialog(this, "This car cannot be edited because it has been sold. ",
                        " Incorrect Operation", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (tableModel.getValueAt(tableDark1.getSelectedRow(), 7).equals(Sales.PENDING)) {
                JOptionPane.showMessageDialog(this, "This car cannot be edited because you have not yet responded to the customer's request.\n"
                        + "Firstly, accept or deny the customer's request. You are directed to the dealer customer request panel.",
                        " Incorrect Operation", JOptionPane.INFORMATION_MESSAGE);

                MainFrame.instance.setPage(MainFrame.instance.getDealerCustomerRequestsPanel());
                return;
            }

            for (Sales sale : Database.getSales()) {
                if ((Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 0) == sale.getId()) {

                    searchedSales = sale;
                    MainFrame.instance.setPage(MainFrame.instance.getDealerEditCarPanel());
                }
            }

        } catch (IndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(this, "No Data Selected from the Table. ",
                    "Selection Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_editCarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button addCarButton;
    private SwingComponents.Button backButton;
    private SwingComponents.Button deleteCarButton;
    private SwingComponents.Button editCarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel myCarsLabel;
    private SwingComponents.TableDark tableDark1;
    // End of variables declaration//GEN-END:variables

    public void PageOn() {
        dealer = (Dealer) MainFrame.instance.getAccount();
        refreshTable();
    }
}
