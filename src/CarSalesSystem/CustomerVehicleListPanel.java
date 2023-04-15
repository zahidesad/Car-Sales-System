package CarSalesSystem;

import Main.MainFrame;
import SwingComponents.EventLogin;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zahid
 */
public class CustomerVehicleListPanel extends javax.swing.JPanel {

    private EventLogin event;

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columNames = {"Dealer ID", "Name", "Brand", "Model", "Type", "Color", "Year", "Fuel Type", "Price", "Status"};

    public CustomerVehicleListPanel() {
        initComponents();
        
        tableModel.setColumnIdentifiers(columNames);
        tableDark1.setModel(tableModel);
    }

    public void setEventLogin(EventLogin event) {
        this.event = event;
    }
    
    public void refreshTable(){
        
    
    
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
        fuelLabel = new javax.swing.JLabel();
        dealerLabel1 = new javax.swing.JLabel();
        brandLabel1 = new javax.swing.JLabel();
        fuelLabel1 = new javax.swing.JLabel();
        buyVehicleButton = new SwingComponents.Button();
        dealerInfoButton1 = new SwingComponents.Button();
        displayDealersButton = new SwingComponents.Button();

        setBackground(new java.awt.Color(153, 153, 153));
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
        add(dealerFilterJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        brandFilterJComboBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        brandFilterJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        brandFilterJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(brandFilterJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        fuelFilterJComboBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        fuelFilterJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        fuelFilterJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(fuelFilterJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, -1));

        typeFilterJComboBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        typeFilterJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        typeFilterJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(typeFilterJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        fuelLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fuelLabel.setForeground(new java.awt.Color(0, 0, 0));
        fuelLabel.setText("Type :");
        add(fuelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 40, 20));

        dealerLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dealerLabel1.setForeground(new java.awt.Color(0, 0, 0));
        dealerLabel1.setText("Dealer :");
        add(dealerLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 50, 20));

        brandLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        brandLabel1.setForeground(new java.awt.Color(0, 0, 0));
        brandLabel1.setText("Brand :");
        add(brandLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 50, 20));

        fuelLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fuelLabel1.setForeground(new java.awt.Color(0, 0, 0));
        fuelLabel1.setText("Fuel : ");
        add(fuelLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 40, 20));

        buyVehicleButton.setBackground(new java.awt.Color(0, 0, 0));
        buyVehicleButton.setForeground(new java.awt.Color(255, 255, 255));
        buyVehicleButton.setText("Buy Vehicle ");
        buyVehicleButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        add(buyVehicleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 280, -1));

        dealerInfoButton1.setBackground(new java.awt.Color(0, 0, 0));
        dealerInfoButton1.setForeground(new java.awt.Color(255, 255, 255));
        dealerInfoButton1.setText("Dealer Info");
        dealerInfoButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        add(dealerInfoButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 170, -1));

        displayDealersButton.setBackground(new java.awt.Color(0, 0, 0));
        displayDealersButton.setForeground(new java.awt.Color(255, 255, 255));
        displayDealersButton.setText("Display Dealers");
        displayDealersButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        add(displayDealersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame.event.setPage(MainFrame.customerControlPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button backButton;
    private javax.swing.JComboBox<String> brandFilterJComboBox;
    private javax.swing.JLabel brandLabel1;
    private SwingComponents.Button buyVehicleButton;
    private javax.swing.JComboBox<String> dealerFilterJComboBox;
    private SwingComponents.Button dealerInfoButton1;
    private javax.swing.JLabel dealerLabel1;
    private SwingComponents.Button displayDealersButton;
    private javax.swing.JComboBox<String> fuelFilterJComboBox;
    private javax.swing.JLabel fuelLabel;
    private javax.swing.JLabel fuelLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private SwingComponents.TableDark tableDark1;
    private javax.swing.JComboBox<String> typeFilterJComboBox;
    private javax.swing.JLabel vehicleListLabel;
    // End of variables declaration//GEN-END:variables
}
