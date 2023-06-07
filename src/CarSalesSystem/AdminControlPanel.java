package CarSalesSystem;

import CorePackage.ITriggerer;
import JPA_Classes.*;
import Main.MainFrame;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zahid
 */
public class AdminControlPanel extends javax.swing.JPanel implements ITriggerer {

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columNames = {"ID", "Name", "Username", "E-mail", "Phone"};
    String[] columNamesCars = {"Sale ID", "Dealer", "Brand", "Model", "Type", "Color", "Year", "Price", "Status"};

    public AdminControlPanel() {
        initComponents();
        tableModel.setColumnIdentifiers(columNames);
        tableDark1.setModel(tableModel);

    }

    public void refreshTable() {
        if (jComboBox1.getSelectedItem().equals("Customers")) {
            tableModel.setRowCount(0);
            tableModel.setColumnIdentifiers(columNames);
            deleteButton.setText("Delete Customer");
            for (Users user : Database.getUsers()) {
                if (user instanceof Customer customer) {
                    Vector rowData = new Vector();
                    rowData.add(customer.getId());
                    rowData.add(customer.getName());
                    rowData.add(customer.getUsername());
                    rowData.add(customer.getEmail());
                    rowData.add(customer.getPhone());

                    tableModel.addRow(rowData);
                }
            }
        } else if (jComboBox1.getSelectedItem().equals("Dealers")) {
            tableModel.setRowCount(0);
            tableModel.setColumnIdentifiers(columNames);
            deleteButton.setText("Delete Dealer");

            for (Users user : Database.getUsers()) {

                if (user instanceof Dealer dealer) {
                    Vector rowData = new Vector();
                    rowData.add(dealer.getId());
                    rowData.add(dealer.getName());
                    rowData.add(dealer.getUsername());
                    rowData.add(dealer.getEmail());
                    rowData.add(dealer.getPhone());

                    tableModel.addRow(rowData);
                }
            }

        } else if (jComboBox1.getSelectedItem().equals("Sales")) {
            tableModel.setRowCount(0);
            tableModel.setColumnIdentifiers(columNamesCars);
            deleteButton.setText("Delete Sale");
            for (Sales sale : Database.getSales()) {
                if (!sale.getStatus().equals(Sales.DENIED)) {
                    Vector rowData = new Vector();
                    rowData.add(sale.getId());
                    if (sale.getDealerId() != null) {
                        rowData.add(sale.getDealerId().getName());
                    } else {
                        rowData.add("Deleted Account");
                    }
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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new SwingComponents.TableDark();
        adminControlPanelLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        deleteButton = new SwingComponents.Button();
        backButton = new SwingComponents.Button();
        downloadSalesArchive = new SwingComponents.Button();

        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(900, 529));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDark1.setBackground(new java.awt.Color(102, 102, 102));
        tableDark1.setForeground(new java.awt.Color(255, 255, 255));
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 860, 320));

        adminControlPanelLabel.setBackground(new java.awt.Color(102, 102, 102));
        adminControlPanelLabel.setFont(new java.awt.Font("SansSerif", 2, 48)); // NOI18N
        adminControlPanelLabel.setForeground(new java.awt.Color(0, 0, 0));
        adminControlPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminControlPanelLabel.setText("ADMIN CONTROL PANEL");
        adminControlPanelLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(adminControlPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 640, 50));

        jComboBox1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customers", "Dealers", "Sales", "" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 30));

        deleteButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete Customer");
        deleteButton.setBorderPainted(false);
        deleteButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 230, -1));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackArrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        downloadSalesArchive.setBackground(new java.awt.Color(0, 0, 0));
        downloadSalesArchive.setForeground(new java.awt.Color(255, 255, 255));
        downloadSalesArchive.setText("Download Sales Archive");
        downloadSalesArchive.setBorderPainted(false);
        downloadSalesArchive.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        downloadSalesArchive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadSalesArchiveActionPerformed(evt);
            }
        });
        add(downloadSalesArchive, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 250, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        refreshTable();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            if (jComboBox1.getSelectedItem().equals("Customers") || jComboBox1.getSelectedItem().equals("Dealers")) {
                Users user = Database.findUserByID((Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 0));
                if (user != null) {
                    if ((JOptionPane.showConfirmDialog(this, "Do you really want to delete this account? "
                            + "This action cannot be undone!", "WARNING",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
                        System.out.println(user.toString());
                        user.deleteAccount();
                        refreshTable();
                    }
                }

            } else if (jComboBox1.getSelectedItem().equals("Sales")) {
                Sales sale = Database.findSaleByID((Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 0));
                if (sale != null) {
                    if (tableModel.getValueAt(tableDark1.getSelectedRow(), 8).equals(Sales.ACCEPTED)) {
                        JOptionPane.showMessageDialog(this, "This car cannot be deleted because it has been sold. ",
                                " Incorrect Operation", JOptionPane.ERROR_MESSAGE);

                    } else if ((JOptionPane.showConfirmDialog(this, "Do you really want to delete this car? "
                            + "This action cannot be undone!", "WARNING",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {

                        if (sale.getStatus().equals(Sales.PENDING)) {
                            sale.setStatus(Sales.AVAILABLE);
                        }

                        Database.removeCar((Integer) tableModel.getValueAt(tableDark1.getSelectedRow(), 0));
                        refreshTable();

                    }
                }else{
                    System.out.println("Null Sale");
                }

            }
        } catch (IndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(this, "No Data Selected from the Table. ",
                    "Selection Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_deleteButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if ((JOptionPane.showConfirmDialog(this, "Do You Want To Log Out?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
            MainFrame.instance.logOut();
        } else {
        }

    }//GEN-LAST:event_backButtonActionPerformed

    private void downloadSalesArchiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadSalesArchiveActionPerformed
        downloadSales();
    }//GEN-LAST:event_downloadSalesArchiveActionPerformed

    public void downloadSales() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int userChoice = fileChooser.showSaveDialog(null);

        if (userChoice == JFileChooser.APPROVE_OPTION) {
            String directoryPath = fileChooser.getSelectedFile().getPath();
            String filename = getFormattedFilename(directoryPath, "Sales_", ".txt");

            ArrayList<String> lines = new ArrayList<>();
            for (Sales sale : Database.getSales()) {
                lines.add(sale.toString() );
            }

            try {
                FileWriter fileWriter = new FileWriter(filename, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                for (String line : lines) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }

                bufferedWriter.close();
                System.out.println("Content written to the file.");
                JOptionPane.showMessageDialog(this, "All sales downloaded successfuly!", "Sales Downloaded", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
            }
        } else if (userChoice == JFileChooser.CANCEL_OPTION) {
            System.out.println("Operation canceled by the user.");
        }
    }

    private static String getFormattedFilename(String directoryPath, String prefix, String extension) {
        LocalDate currentDate = LocalDate.now();
        String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        return directoryPath + "/" + prefix + "_" + formattedDate + extension;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminControlPanelLabel;
    private SwingComponents.Button backButton;
    private SwingComponents.Button deleteButton;
    private SwingComponents.Button downloadSalesArchive;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private SwingComponents.TableDark tableDark1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PageOn() {

    }
}
