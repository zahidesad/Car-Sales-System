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
public class CustomerCarListPanel extends javax.swing.JPanel implements ITriggerer {

    private Customer customer;

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columNames = {"Dealer ID", "Name", "Sale ID", "Brand", "Model", "Type", "Color", "Year", "Fuel Type", "Price", "Status"};
    String[] columNamesForDisplayDealers = {"Dealer ID", "Username", "Name", "Phone", "E-mail"};

    public CustomerCarListPanel() {
        initComponents();

        tableModel.setColumnIdentifiers(columNames);
        tableDark1.setModel(tableModel);
    }

    public void refreshTable() {
        tableModel.setRowCount(0);
        tableModel.setColumnIdentifiers(columNames);

        displayDealersButton.setText("Display Dealers");
        buyCarButton.setVisible(true);

        brandLabel.setVisible(true);
        brandFilterJComboBox.setVisible(true);
        typeLabel.setVisible(true);
        typeFilterJComboBox.setVisible(true);
        fuelLabel.setVisible(true);
        fuelFilterJComboBox.setVisible(true);
        dealerLabel.setVisible(true);
        dealerFilterJComboBox.setVisible(true);

        for (Sales sale : Database.getSales()) {
            if (!sale.getStatus().equals(Sales.DENIED)) {
                Vector rowData = new Vector();
                rowData.add(sale.getDealerId().getId());
                if (sale.getDealerId() != null) {
                    rowData.add(sale.getDealerId().getName());
                } else {
                    rowData.add("Deleted Account");
                }
                rowData.add(sale.getId());
                rowData.add(sale.getCarId().getBrand());
                rowData.add(sale.getCarId().getModel());
                rowData.add(sale.getCarId().getType());
                rowData.add(sale.getCarId().getColor());
                rowData.add(sale.getCarId().getAge());
                rowData.add(sale.getCarId().getFuel());
                rowData.add(sale.getCarId().getPrice());
                rowData.add(sale.getStatus());

                tableModel.addRow(rowData);
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carListLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new SwingComponents.TableDark();
        backButton = new SwingComponents.Button();
        dealerFilterJComboBox = new javax.swing.JComboBox<>();
        brandFilterJComboBox = new javax.swing.JComboBox<>();
        fuelFilterJComboBox = new javax.swing.JComboBox<>();
        typeFilterJComboBox = new javax.swing.JComboBox<>();
        typeLabel = new javax.swing.JLabel();
        dealerLabel = new javax.swing.JLabel();
        brandLabel = new javax.swing.JLabel();
        fuelLabel = new javax.swing.JLabel();
        buyCarButton = new SwingComponents.Button();
        dealerInfoButton = new SwingComponents.Button();
        displayDealersButton = new SwingComponents.Button();

        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(900, 529));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carListLabel.setBackground(new java.awt.Color(102, 102, 102));
        carListLabel.setFont(new java.awt.Font("SansSerif", 2, 48)); // NOI18N
        carListLabel.setForeground(new java.awt.Color(0, 0, 0));
        carListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carListLabel.setText("CAR LIST");
        carListLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(carListLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 490, 60));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 840, 320));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackArrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        dealerFilterJComboBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        dealerFilterJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        dealerFilterJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dealerFilterJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealerFilterJComboBoxActionPerformed(evt);
            }
        });
        add(dealerFilterJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 105, -1, 30));

        brandFilterJComboBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        brandFilterJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        brandFilterJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        brandFilterJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandFilterJComboBoxActionPerformed(evt);
            }
        });
        add(brandFilterJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 105, -1, 30));

        fuelFilterJComboBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        fuelFilterJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        fuelFilterJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fuelFilterJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelFilterJComboBoxActionPerformed(evt);
            }
        });
        add(fuelFilterJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 105, -1, 30));

        typeFilterJComboBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        typeFilterJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        typeFilterJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typeFilterJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeFilterJComboBoxActionPerformed(evt);
            }
        });
        add(typeFilterJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 105, -1, 30));

        typeLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(0, 0, 0));
        typeLabel.setText("Type :");
        add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        dealerLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dealerLabel.setForeground(new java.awt.Color(0, 0, 0));
        dealerLabel.setText("Dealer :");
        add(dealerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        brandLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        brandLabel.setForeground(new java.awt.Color(0, 0, 0));
        brandLabel.setText("Brand :");
        add(brandLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        fuelLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fuelLabel.setForeground(new java.awt.Color(0, 0, 0));
        fuelLabel.setText("Fuel : ");
        add(fuelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        buyCarButton.setBackground(new java.awt.Color(0, 0, 0));
        buyCarButton.setForeground(new java.awt.Color(255, 255, 255));
        buyCarButton.setText("Buy Car");
        buyCarButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        buyCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyCarButtonActionPerformed(evt);
            }
        });
        add(buyCarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 280, -1));

        dealerInfoButton.setBackground(new java.awt.Color(0, 0, 0));
        dealerInfoButton.setForeground(new java.awt.Color(255, 255, 255));
        dealerInfoButton.setText("Dealer Info");
        dealerInfoButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        dealerInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealerInfoButtonActionPerformed(evt);
            }
        });
        add(dealerInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 170, -1));

        displayDealersButton.setBackground(new java.awt.Color(0, 0, 0));
        displayDealersButton.setForeground(new java.awt.Color(255, 255, 255));
        displayDealersButton.setText("Display Dealers");
        displayDealersButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        displayDealersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayDealersButtonActionPerformed(evt);
            }
        });
        add(displayDealersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getCustomerControlPanel());
    }//GEN-LAST:event_backButtonActionPerformed

    private void dealerFilterJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealerFilterJComboBoxActionPerformed
        tableModel.setRowCount(0);
        for (Users user : Database.getUsers()) {
            if (user instanceof Dealer dealer) {
                try {

                    if (dealerFilterJComboBox.getSelectedItem().equals(dealer)) {

                        for (Sales sale : Database.showDealerSales(((Dealer) dealerFilterJComboBox.getSelectedItem()).getId())) {
                            Vector rowData = new Vector();
                            if (!sale.getStatus().equals(Sales.DENIED)) {
                                rowData.add(sale.getDealerId().getId());
                                rowData.add(sale.getDealerId().getName());
                                rowData.add(sale.getId());
                                rowData.add(sale.getCarId().getBrand());
                                rowData.add(sale.getCarId().getModel());
                                rowData.add(sale.getCarId().getType());
                                rowData.add(sale.getCarId().getColor());
                                rowData.add(sale.getCarId().getAge());
                                rowData.add(sale.getCarId().getFuel());
                                rowData.add(sale.getCarId().getPrice());
                                rowData.add(sale.getStatus());

                                tableModel.addRow(rowData);
                            }
                        }
                    }
                } catch (NullPointerException exception) {

                }

            }
        }

    }//GEN-LAST:event_dealerFilterJComboBoxActionPerformed

    private void dealerInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealerInfoButtonActionPerformed
        try {
            for (Users user : Database.getUsers()) {
                Users dealer = Database.findUserByID((Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 0));

                MainFrame.instance.getDealerAccountDetailsPanel().dealer = (Dealer) dealer;
                MainFrame.instance.getDealerAccountDetailsPanel().accountDetailsForCustomer();
                if (dealer != null) {  //Extra control when admin deletes a dealer account or dealer deletes their own account
                    MainFrame.instance.setPage(MainFrame.instance.getDealerAccountDetailsPanel());
                } else {
                    JOptionPane.showMessageDialog(this, "This dealer account has been deleted by itself or by the admin. ",
                            "Undefined User", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        } catch (IndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(this, "No Data Selected from the Table. ",
                    "Selection Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_dealerInfoButtonActionPerformed

    private void brandFilterJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandFilterJComboBoxActionPerformed
        tableModel.setRowCount(0);
        for (Sales sale : Database.getSales()) {
            try {
                if (brandFilterJComboBox.getSelectedItem().equals(sale.getCarId().getBrand())) {
                    if (!sale.getStatus().equals(Sales.DENIED)) {
                        Vector rowData = new Vector();

                        rowData.add(sale.getDealerId().getId());
                        rowData.add(sale.getDealerId().getName());
                        rowData.add(sale.getId());
                        rowData.add(sale.getCarId().getBrand());
                        rowData.add(sale.getCarId().getModel());
                        rowData.add(sale.getCarId().getType());
                        rowData.add(sale.getCarId().getColor());
                        rowData.add(sale.getCarId().getAge());
                        rowData.add(sale.getCarId().getFuel());
                        rowData.add(sale.getCarId().getPrice());
                        rowData.add(sale.getStatus());

                        tableModel.addRow(rowData);
                    }
                }
            } catch (NullPointerException e) {
            }
        }
    }//GEN-LAST:event_brandFilterJComboBoxActionPerformed

    private void displayDealersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayDealersButtonActionPerformed

        if (displayDealersButton.getText().equals("Display Dealers")) {
            tableModel.setRowCount(0);
            tableModel.setColumnIdentifiers(columNamesForDisplayDealers);
            displayDealersButton.setText("Display Sales");
            buyCarButton.setVisible(false);

            brandLabel.setVisible(false);
            brandFilterJComboBox.setVisible(false);
            typeLabel.setVisible(false);
            typeFilterJComboBox.setVisible(false);
            fuelLabel.setVisible(false);
            fuelFilterJComboBox.setVisible(false);
            dealerLabel.setVisible(false);
            dealerFilterJComboBox.setVisible(false);

            for (Users user : Database.getUsers()) {
                if (user instanceof Dealer dealer) {

                    Vector rowData = new Vector();

                    rowData.add(dealer.getId());
                    rowData.add(dealer.getName());
                    rowData.add(dealer.getUsername());
                    rowData.add(dealer.getPhone());
                    rowData.add(dealer.getEmail());

                    tableModel.addRow(rowData);
                }
            }
        } else {

            refreshTable();
        }


    }//GEN-LAST:event_displayDealersButtonActionPerformed

    private void buyCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyCarButtonActionPerformed
        try {
            if (tableDark1.getValueAt(tableDark1.getSelectedRow(), 10).equals(Sales.PENDING)
                    || tableDark1.getValueAt(tableDark1.getSelectedRow(), 10).equals(Sales.ACCEPTED)) {
                JOptionPane.showMessageDialog(this, "This car cannot buyed! ",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if ((JOptionPane.showConfirmDialog(this, "Do you really want to buy this car? ", "Are You Sure?",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {

                int result = Database.buyCar((Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 2), customer);
                if (result == -1) {
                    JOptionPane.showMessageDialog(this, "You cannot submit a request again for a car that you "
                            + "have previously purchased and denied.", "Invalid Transaction", JOptionPane.ERROR_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "Your order has been processed",
                            "Your Order Successful", JOptionPane.INFORMATION_MESSAGE);
                    refreshTable();
                }
            } else {

            }
        } catch (IndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(this, "No Data Selected from the Table. ",
                    "Selection Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_buyCarButtonActionPerformed

    private void typeFilterJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeFilterJComboBoxActionPerformed
        tableModel.setRowCount(0);
        for (Sales sale : Database.getSales()) {
            try {
                if (typeFilterJComboBox.getSelectedItem().equals(sale.getCarId().getType())) {
                    if (!sale.getStatus().equals(Sales.DENIED)) {
                        Vector rowData = new Vector();

                        rowData.add(sale.getDealerId().getId());
                        rowData.add(sale.getDealerId().getName());
                        rowData.add(sale.getId());
                        rowData.add(sale.getCarId().getBrand());
                        rowData.add(sale.getCarId().getModel());
                        rowData.add(sale.getCarId().getType());
                        rowData.add(sale.getCarId().getColor());
                        rowData.add(sale.getCarId().getAge());
                        rowData.add(sale.getCarId().getFuel());
                        rowData.add(sale.getCarId().getPrice());
                        rowData.add(sale.getStatus());

                        tableModel.addRow(rowData);
                    }
                }
            } catch (NullPointerException exception) {
            }
        }
    }//GEN-LAST:event_typeFilterJComboBoxActionPerformed

    private void fuelFilterJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelFilterJComboBoxActionPerformed
        tableModel.setRowCount(0);
        for (Sales sale : Database.getSales()) {
            try {
                if (fuelFilterJComboBox.getSelectedItem().equals(sale.getCarId().getFuel())) {
                    if (!sale.getStatus().equals(Sales.DENIED)) {
                        Vector rowData = new Vector();

                        rowData.add(sale.getDealerId().getId());
                        rowData.add(sale.getDealerId().getName());
                        rowData.add(sale.getId());
                        rowData.add(sale.getCarId().getBrand());
                        rowData.add(sale.getCarId().getModel());
                        rowData.add(sale.getCarId().getType());
                        rowData.add(sale.getCarId().getColor());
                        rowData.add(sale.getCarId().getAge());
                        rowData.add(sale.getCarId().getFuel());
                        rowData.add(sale.getCarId().getPrice());
                        rowData.add(sale.getStatus());
                        tableModel.addRow(rowData);
                    }
                }
            } catch (NullPointerException exception) {

            }
        }
    }//GEN-LAST:event_fuelFilterJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button backButton;
    private javax.swing.JComboBox<String> brandFilterJComboBox;
    private javax.swing.JLabel brandLabel;
    private SwingComponents.Button buyCarButton;
    private javax.swing.JLabel carListLabel;
    private javax.swing.JComboBox<Object> dealerFilterJComboBox;
    private SwingComponents.Button dealerInfoButton;
    private javax.swing.JLabel dealerLabel;
    private SwingComponents.Button displayDealersButton;
    private javax.swing.JComboBox<String> fuelFilterJComboBox;
    private javax.swing.JLabel fuelLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private SwingComponents.TableDark tableDark1;
    private javax.swing.JComboBox<String> typeFilterJComboBox;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PageOn() {
        customer = (Customer) MainFrame.instance.getAccount();
        refreshTable();

        dealerFilterJComboBox.removeAllItems();
        brandFilterJComboBox.removeAllItems();
        typeFilterJComboBox.removeAllItems();
        fuelFilterJComboBox.removeAllItems();

        for (int i = 0; i < Database.getUsers().size(); i++) {
            if (Database.getUsers().get(i) instanceof Dealer) {
                dealerFilterJComboBox.addItem(Database.getUsers().get(i));
            }
        }

        for (String carBrand : Cars.carBrand) {
            brandFilterJComboBox.addItem(carBrand);
        }

        for (String carType : Cars.carType) {
            typeFilterJComboBox.addItem(carType);
        }

        for (String carFuelType : Cars.carFuelType) {
            fuelFilterJComboBox.addItem(carFuelType);
        }

    }
}
