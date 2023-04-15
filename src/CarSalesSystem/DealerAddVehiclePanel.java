package CarSalesSystem;

import CorePackage.Database;
import CorePackage.Dealer;
import CorePackage.ITriggerer;
import CorePackage.Vehicle;
import Main.MainFrame;
import SwingComponents.EventLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class DealerAddVehiclePanel extends javax.swing.JPanel implements ITriggerer {

    private EventLogin event;

    public DealerAddVehiclePanel() {
        initComponents();
    }

    public void setEventLogin(EventLogin event) {
        this.event = event;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addVehicleLabel = new javax.swing.JLabel();
        backButton = new SwingComponents.Button();
        modelLabel = new SwingComponents.Label();
        fuelTypejComboBox = new javax.swing.JComboBox<>();
        priceLabel = new SwingComponents.Label();
        brandLabel = new SwingComponents.Label();
        brandjComboBox = new javax.swing.JComboBox<>();
        typeLabel = new SwingComponents.Label();
        txtPrice = new SwingComponents.TextField();
        txtModel = new SwingComponents.TextField();
        typejComboBox = new javax.swing.JComboBox<>();
        colorLabel = new SwingComponents.Label();
        yearLabel = new SwingComponents.Label();
        yearjComboBox = new javax.swing.JComboBox<>();
        fuelTypeLabel = new SwingComponents.Label();
        txtColor = new SwingComponents.TextField();
        addVehicleButton = new SwingComponents.Button();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addVehicleLabel.setBackground(new java.awt.Color(102, 102, 102));
        addVehicleLabel.setFont(new java.awt.Font("SansSerif", 2, 48)); // NOI18N
        addVehicleLabel.setForeground(new java.awt.Color(0, 0, 0));
        addVehicleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addVehicleLabel.setText("ADD VEHICLE");
        addVehicleLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(addVehicleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 490, 60));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackArrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        modelLabel.setBackground(new java.awt.Color(153, 153, 153));
        modelLabel.setForeground(new java.awt.Color(0, 0, 0));
        modelLabel.setText("Model :");
        modelLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(modelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 180, 40));

        fuelTypejComboBox.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        fuelTypejComboBox.setForeground(new java.awt.Color(255, 255, 255));
        fuelTypejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(fuelTypejComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 180, 40));

        priceLabel.setBackground(new java.awt.Color(153, 153, 153));
        priceLabel.setForeground(new java.awt.Color(0, 0, 0));
        priceLabel.setText("Price :");
        priceLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 180, 40));

        brandLabel.setBackground(new java.awt.Color(153, 153, 153));
        brandLabel.setForeground(new java.awt.Color(0, 0, 0));
        brandLabel.setText("Brand :");
        brandLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(brandLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 180, 40));

        brandjComboBox.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        brandjComboBox.setForeground(new java.awt.Color(255, 255, 255));
        brandjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(brandjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 180, 40));

        typeLabel.setBackground(new java.awt.Color(153, 153, 153));
        typeLabel.setForeground(new java.awt.Color(0, 0, 0));
        typeLabel.setText("Type :");
        typeLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 180, 40));

        txtPrice.setForeground(new java.awt.Color(0, 0, 0));
        txtPrice.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 180, 40));

        txtModel.setForeground(new java.awt.Color(0, 0, 0));
        txtModel.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 180, 40));

        typejComboBox.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        typejComboBox.setForeground(new java.awt.Color(255, 255, 255));
        typejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(typejComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 180, 40));

        colorLabel.setBackground(new java.awt.Color(153, 153, 153));
        colorLabel.setForeground(new java.awt.Color(0, 0, 0));
        colorLabel.setText("Color :");
        colorLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(colorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 180, 40));

        yearLabel.setBackground(new java.awt.Color(153, 153, 153));
        yearLabel.setForeground(new java.awt.Color(0, 0, 0));
        yearLabel.setText("Year :");
        yearLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(yearLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 180, 40));

        yearjComboBox.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        yearjComboBox.setForeground(new java.awt.Color(255, 255, 255));
        yearjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(yearjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 180, 40));

        fuelTypeLabel.setBackground(new java.awt.Color(153, 153, 153));
        fuelTypeLabel.setForeground(new java.awt.Color(0, 0, 0));
        fuelTypeLabel.setText("Fuel Type :");
        fuelTypeLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(fuelTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 180, 40));

        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        txtColor.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 180, 40));

        addVehicleButton.setBackground(new java.awt.Color(0, 0, 0));
        addVehicleButton.setForeground(new java.awt.Color(255, 255, 255));
        addVehicleButton.setText("Add Vehicle");
        addVehicleButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        addVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehicleButtonActionPerformed(evt);
            }
        });
        add(addVehicleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame.event.setPage(MainFrame.dealerManageVehiclePanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehicleButtonActionPerformed
        Dealer dealer = (Dealer) MainFrame.account;
        Vehicle vehicle = new Vehicle(dealer, null, brandjComboBox.getSelectedItem().toString(), txtModel.getText(),
                txtColor.getText(), typejComboBox.getSelectedItem().toString(), fuelTypejComboBox.getSelectedItem().toString(),
                yearjComboBox.getSelectedItem().toString(), txtPrice.getText());

        if (txtModel.getText().equals("") || txtColor.getText().equals("") || txtPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Fill All Entries.",
                    "Failure", JOptionPane.ERROR_MESSAGE);
        } else {
            Database.getVehicles().add(vehicle);
            dealer.getListedVehicles().add(vehicle);
            JOptionPane.showMessageDialog(this, "Successfully Created A Vehicle ",
                    "Operation Successful", JOptionPane.INFORMATION_MESSAGE);
            MainFrame.event.setPage(MainFrame.dealerManageVehiclePanel);
        }

    }//GEN-LAST:event_addVehicleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button addVehicleButton;
    private javax.swing.JLabel addVehicleLabel;
    private SwingComponents.Button backButton;
    private SwingComponents.Label brandLabel;
    private javax.swing.JComboBox<String> brandjComboBox;
    private SwingComponents.Label colorLabel;
    private SwingComponents.Label fuelTypeLabel;
    private javax.swing.JComboBox<String> fuelTypejComboBox;
    private SwingComponents.Label modelLabel;
    private SwingComponents.Label priceLabel;
    private SwingComponents.TextField txtColor;
    private SwingComponents.TextField txtModel;
    private SwingComponents.TextField txtPrice;
    private SwingComponents.Label typeLabel;
    private javax.swing.JComboBox<String> typejComboBox;
    private SwingComponents.Label yearLabel;
    private javax.swing.JComboBox<String> yearjComboBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PageOn() {
        brandjComboBox.removeAllItems();
        typejComboBox.removeAllItems();
        yearjComboBox.removeAllItems();
        fuelTypejComboBox.removeAllItems();

        for (int i = 0; i < Vehicle.vehicleBrand.length; i++) {
            brandjComboBox.addItem(Vehicle.vehicleBrand[i]);
        }

        for (int i = 0; i < Vehicle.vehicleType.length; i++) {
            typejComboBox.addItem(Vehicle.vehicleType[i]);
        }

        for (int i = 2002; i <= 2023; i++) {
            yearjComboBox.addItem(i + "");
        }

        for (int i = 0; i < Vehicle.vehicleFuelType.length; i++) {
            fuelTypejComboBox.addItem(Vehicle.vehicleFuelType[i]);
        }

    }
}
