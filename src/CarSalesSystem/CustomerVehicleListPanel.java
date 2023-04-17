package CarSalesSystem;

import CorePackage.Customer;
import CorePackage.Database;
import CorePackage.Dealer;
import CorePackage.ITriggerer;
import CorePackage.User;
import CorePackage.Vehicle;
import Main.MainFrame;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zahid
 */
public class CustomerVehicleListPanel extends javax.swing.JPanel implements ITriggerer {

    private Customer customer;

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columNames = {"Dealer ID", "Name", "Vehicle ID", "Brand", "Model", "Type", "Color", "Year", "Fuel Type", "Price", "Status"};
    String[] columNamesForDisplayDealers = {"Dealer ID", "Username", "Name", "Phone", "E-mail"};

    public CustomerVehicleListPanel() {
        initComponents();

        tableModel.setColumnIdentifiers(columNames);
        tableDark1.setModel(tableModel);
    }

    public void refreshTable() {
        tableModel.setRowCount(0);
        tableModel.setColumnIdentifiers(columNames);

        displayDealersButton.setText("Display Dealers");
        buyVehicleButton.setVisible(true);

        brandLabel.setVisible(true);
        brandFilterJComboBox.setVisible(true);
        typeLabel.setVisible(true);
        typeFilterJComboBox.setVisible(true);
        fuelLabel.setVisible(true);
        fuelFilterJComboBox.setVisible(true);

        for (Vehicle vehicle : Database.getVehicles()) {

            Vector rowData = new Vector();

            rowData.add(vehicle.getDealer().getId());
            rowData.add(vehicle.getDealer().getName());
            rowData.add(vehicle.getId());
            rowData.add(vehicle.getBrand());
            rowData.add(vehicle.getModel());
            rowData.add(vehicle.getType());
            rowData.add(vehicle.getColor());
            rowData.add(vehicle.getYear());
            rowData.add(vehicle.getFuel());
            rowData.add(vehicle.getPrice());
            rowData.add(vehicle.getRegister());

            tableModel.addRow(rowData);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vehicleListLabel = new javax.swing.JLabel();
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
        buyVehicleButton = new SwingComponents.Button();
        dealerInfoButton = new SwingComponents.Button();
        displayDealersButton = new SwingComponents.Button();

        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(900, 529));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vehicleListLabel.setBackground(new java.awt.Color(102, 102, 102));
        vehicleListLabel.setFont(new java.awt.Font("SansSerif", 2, 48)); // NOI18N
        vehicleListLabel.setForeground(new java.awt.Color(0, 0, 0));
        vehicleListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vehicleListLabel.setText("VEHICLE LIST");
        vehicleListLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(vehicleListLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 490, 60));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 840, 320));

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
        add(fuelFilterJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 105, -1, 30));

        typeFilterJComboBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        typeFilterJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        typeFilterJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        buyVehicleButton.setBackground(new java.awt.Color(0, 0, 0));
        buyVehicleButton.setForeground(new java.awt.Color(255, 255, 255));
        buyVehicleButton.setText("Buy Vehicle ");
        buyVehicleButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        buyVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyVehicleButtonActionPerformed(evt);
            }
        });
        add(buyVehicleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 280, -1));

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

        for (User user : Database.getUsers()) {
            if (user instanceof Dealer dealer) {
                if (dealerFilterJComboBox.getSelectedIndex() != -1) {

                    if (dealerFilterJComboBox.getSelectedItem().equals(dealer.getName())) {
                        tableModel.setRowCount(0);
                        for (Vehicle listedVehicle : dealer.getListedVehicles()) {
                            Vector rowData = new Vector();

                            rowData.add(listedVehicle.getDealer().getId());
                            rowData.add(listedVehicle.getDealer().getName());
                            rowData.add(listedVehicle.getId());
                            rowData.add(listedVehicle.getBrand());
                            rowData.add(listedVehicle.getModel());
                            rowData.add(listedVehicle.getType());
                            rowData.add(listedVehicle.getColor());
                            rowData.add(listedVehicle.getYear());
                            rowData.add(listedVehicle.getFuel());
                            rowData.add(listedVehicle.getPrice());
                            rowData.add(listedVehicle.getRegister());

                            tableModel.addRow(rowData);
                        }
                    }
                }

            }
        }

    }//GEN-LAST:event_dealerFilterJComboBoxActionPerformed

    private void dealerInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealerInfoButtonActionPerformed
        if (tableDark1.getSelectedRow() != -1) {
            for (User user : Database.getUsers()) {
                User dealer = user.findUser((Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 0));

                MainFrame.instance.getDealerAccountDetailsPanel().dealer = (Dealer) dealer;
                MainFrame.instance.getDealerAccountDetailsPanel().accountDetailsForCustomer();
                MainFrame.instance.setPage(MainFrame.instance.getDealerAccountDetailsPanel());

            }
        } else {
            JOptionPane.showMessageDialog(this, "No Data Selected from the Table. ",
                    "Selection Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_dealerInfoButtonActionPerformed

    private void brandFilterJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandFilterJComboBoxActionPerformed
        for (int i = 0; i < Vehicle.vehicleBrand.length; i++) {
            if (brandFilterJComboBox.getSelectedIndex() != -1) {
                if (brandFilterJComboBox.getSelectedItem().equals(Vehicle.vehicleBrand[i])) {
                    tableModel.setRowCount(0);

                    for (Vehicle vehicle : Database.getVehicles()) {
                        Vector rowData = new Vector();

                        rowData.add(vehicle.getDealer().getId());
                        rowData.add(vehicle.getDealer().getName());
                        rowData.add(vehicle.getId());
                        rowData.add(vehicle.getBrand());
                        rowData.add(vehicle.getModel());
                        rowData.add(vehicle.getType());
                        rowData.add(vehicle.getColor());
                        rowData.add(vehicle.getYear());
                        rowData.add(vehicle.getFuel());
                        rowData.add(vehicle.getPrice());
                        rowData.add(vehicle.getRegister());

                        tableModel.addRow(rowData);
                    }

                }
            }
        }
    }//GEN-LAST:event_brandFilterJComboBoxActionPerformed

    private void displayDealersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayDealersButtonActionPerformed

        if (displayDealersButton.getText().equals("Display Dealers")) {
            tableModel.setRowCount(0);
            tableModel.setColumnIdentifiers(columNamesForDisplayDealers);
            displayDealersButton.setText("Display Vehicles");
            buyVehicleButton.setVisible(false);

            brandLabel.setVisible(false);
            brandFilterJComboBox.setVisible(false);
            typeLabel.setVisible(false);
            typeFilterJComboBox.setVisible(false);
            fuelLabel.setVisible(false);
            fuelFilterJComboBox.setVisible(false);

            for (User user : Database.getUsers()) {
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

    private void buyVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyVehicleButtonActionPerformed
        if (tableDark1.getSelectedRow() != -1) {
            if (tableDark1.getValueAt(tableDark1.getSelectedRow(), 10).equals(Vehicle.pending)
                    || tableDark1.getValueAt(tableDark1.getSelectedRow(), 10).equals(Vehicle.accepted)) {
                JOptionPane.showMessageDialog(this, "This vehicle cannot buyed! ",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if ((JOptionPane.showConfirmDialog(this, "Do you really want to buy this vehicle? ", "Are You Sure?",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {

                customer.buyVehicle((Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 2));
                if (customer.isFlagForBuyVehicle()) {
                    JOptionPane.showMessageDialog(this, "You cannot submit a request again for a car that you "
                            + "have previously purchased and rejected.", "Invalid Transaction", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Your order has been processed",
                            "Your Order Successful", JOptionPane.INFORMATION_MESSAGE);
                    refreshTable();
                }
            } else {

            }
        } else {
            JOptionPane.showMessageDialog(this, "No Data Selected from the Table. ",
                    "Selection Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_buyVehicleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button backButton;
    private javax.swing.JComboBox<String> brandFilterJComboBox;
    private javax.swing.JLabel brandLabel;
    private SwingComponents.Button buyVehicleButton;
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
    private javax.swing.JLabel vehicleListLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PageOn() {
        customer = (Customer) MainFrame.instance.getAccount();
        refreshTable();
        
        customer.setFlagForBuyVehicle(false);
        dealerFilterJComboBox.removeAllItems();
        brandFilterJComboBox.removeAllItems();
        typeFilterJComboBox.removeAllItems();
        fuelFilterJComboBox.removeAllItems();

        for (int i = 0; i < Database.getUsers().size(); i++) {
            if (Database.getUsers().get(i) instanceof Dealer) {
                dealerFilterJComboBox.addItem(Database.getUsers().get(i).getName());
            }
        }

        for (int i = 0; i < Vehicle.vehicleBrand.length; i++) {
            brandFilterJComboBox.addItem(Vehicle.vehicleBrand[i]);
        }

        for (int i = 0; i < Vehicle.vehicleType.length; i++) {
            typeFilterJComboBox.addItem(Vehicle.vehicleType[i]);

        }

        for (int i = 0; i < Vehicle.vehicleFuelType.length; i++) {
            fuelFilterJComboBox.addItem(Vehicle.vehicleFuelType[i]);
        }

    }
}
