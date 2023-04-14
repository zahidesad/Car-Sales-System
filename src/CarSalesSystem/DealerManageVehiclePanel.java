package CarSalesSystem;

import CorePackage.*;
import Main.MainFrame;
import SwingComponents.EventLogin;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zahid
 */
public class DealerManageVehiclePanel extends javax.swing.JPanel {

    private EventLogin event;
    

    Dealer dealer = new Dealer();

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columNames = {"ID", "Brand", "Model", "Type", "Color", "Year", "Price", "Status"};

    public DealerManageVehiclePanel() {
        initComponents();

        tableModel.setColumnIdentifiers(columNames);
        tableDark1.setModel(tableModel);
        refreshTable();

    }

    public void setEventLogin(EventLogin event) {
        this.event = event;
    }

    public void refreshTable() {
        tableModel.setRowCount(0);
        tableModel.setColumnIdentifiers(columNames);

        for (Vehicle listedVehicle : dealer.getListedVehicles()) {
            Vector rowData = new Vector();
            rowData.add(listedVehicle.getId());
            rowData.add(listedVehicle.getBrand());
            rowData.add(listedVehicle.getModel());
            rowData.add(listedVehicle.getType());
            rowData.add(listedVehicle.getColor());
            rowData.add(listedVehicle.getYear());
            rowData.add(listedVehicle.getPrice());
            rowData.add(listedVehicle.getYear());
            rowData.add(listedVehicle.getRegister());

            tableModel.addRow(rowData);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dealerManageVehiclePanelLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new SwingComponents.TableDark();
        addVehicleButton = new SwingComponents.Button();
        deleteVehicleButton = new SwingComponents.Button();
        backButton = new SwingComponents.Button();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dealerManageVehiclePanelLabel.setBackground(new java.awt.Color(102, 102, 102));
        dealerManageVehiclePanelLabel.setFont(new java.awt.Font("SansSerif", 2, 42)); // NOI18N
        dealerManageVehiclePanelLabel.setForeground(new java.awt.Color(0, 0, 0));
        dealerManageVehiclePanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dealerManageVehiclePanelLabel.setText("DEALER MANAGE VEHICLE PANEL");
        dealerManageVehiclePanelLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(dealerManageVehiclePanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 720, 60));

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

        addVehicleButton.setBackground(new java.awt.Color(0, 0, 0));
        addVehicleButton.setForeground(new java.awt.Color(255, 255, 255));
        addVehicleButton.setText("Add Vehicle");
        addVehicleButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        add(addVehicleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 180, -1));

        deleteVehicleButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteVehicleButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteVehicleButton.setText("Delete Vehicle");
        deleteVehicleButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        add(deleteVehicleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 180, -1));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackArrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame.event.setPage(MainFrame.dealerControlPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button addVehicleButton;
    private SwingComponents.Button backButton;
    private javax.swing.JLabel dealerManageVehiclePanelLabel;
    private SwingComponents.Button deleteVehicleButton;
    private javax.swing.JScrollPane jScrollPane1;
    private SwingComponents.TableDark tableDark1;
    // End of variables declaration//GEN-END:variables
}
