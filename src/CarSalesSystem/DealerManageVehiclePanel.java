package CarSalesSystem;

import CorePackage.*;
import Main.MainFrame;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zahid
 */
public class DealerManageVehiclePanel extends javax.swing.JPanel implements ITriggerer {

    private Dealer dealer;

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columNames = {"ID", "Brand", "Model", "Type", "Color", "Year", "Price", "Status"};

    public DealerManageVehiclePanel() {
        initComponents();
        tableModel.setColumnIdentifiers(columNames);
        tableDark1.setModel(tableModel);

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
            rowData.add(listedVehicle.getRegister());

            tableModel.addRow(rowData);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myVehiclesLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new SwingComponents.TableDark();
        addVehicleButton = new SwingComponents.Button();
        deleteVehicleButton = new SwingComponents.Button();
        backButton = new SwingComponents.Button();

        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(900, 529));
        setPreferredSize(new java.awt.Dimension(900, 529));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myVehiclesLabel.setBackground(new java.awt.Color(102, 102, 102));
        myVehiclesLabel.setFont(new java.awt.Font("SansSerif", 2, 42)); // NOI18N
        myVehiclesLabel.setForeground(new java.awt.Color(0, 0, 0));
        myVehiclesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myVehiclesLabel.setText("MY VEHICLES");
        myVehiclesLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(myVehiclesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 350, 60));

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
        addVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehicleButtonActionPerformed(evt);
            }
        });
        add(addVehicleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 180, -1));

        deleteVehicleButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteVehicleButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteVehicleButton.setText("Delete Vehicle");
        deleteVehicleButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        deleteVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVehicleButtonActionPerformed(evt);
            }
        });
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
        MainFrame.instance.setPage(MainFrame.instance.getDealerControlPanel());
    }//GEN-LAST:event_backButtonActionPerformed

    private void addVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehicleButtonActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getDealerAddVehiclePanel());
    }//GEN-LAST:event_addVehicleButtonActionPerformed

    private void deleteVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVehicleButtonActionPerformed
        if (tableDark1.getSelectedRow() != -1) {
            if (tableModel.getValueAt(tableDark1.getSelectedRow(), 7).equals(Vehicle.accepted)) {
                JOptionPane.showMessageDialog(this, "This car cannot be deleted because it has been sold. ",
                        " Incorrect Operation", JOptionPane.ERROR_MESSAGE);

                return;
            }

            for (int i = 0; i < dealer.getListedVehicles().size(); i++) {
                if ((Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 0)
                        == dealer.getListedVehicles().get(i).getId()) {
                    dealer.removeVehicle(dealer.getListedVehicles().get(i).getId());
                    refreshTable();
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "No Data Selected from the Table. ",
                    "Selection Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_deleteVehicleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button addVehicleButton;
    private SwingComponents.Button backButton;
    private SwingComponents.Button deleteVehicleButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel myVehiclesLabel;
    private SwingComponents.TableDark tableDark1;
    // End of variables declaration//GEN-END:variables

    public void PageOn() {
        dealer = (Dealer) MainFrame.instance.getAccount();
        refreshTable();
    }
}
