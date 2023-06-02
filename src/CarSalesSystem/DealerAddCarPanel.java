package CarSalesSystem;

import CorePackage.Database;
import CorePackage.Dealer;
import CorePackage.ITriggerer;
import CorePackage.Car;
import Main.MainFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class DealerAddCarPanel extends javax.swing.JPanel implements ITriggerer {

    private boolean flagForModelLabel = false;
    private boolean flagForColorLabel = false;
    private boolean flagForPriceLabel = false;

    public DealerAddCarPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCarPanelLabel = new javax.swing.JLabel();
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
        addCarButton = new SwingComponents.Button();
        modelIconLabel = new javax.swing.JLabel();
        colorIconLabel = new javax.swing.JLabel();
        priceIconLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(900, 529));
        setPreferredSize(new java.awt.Dimension(900, 529));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addCarPanelLabel.setBackground(new java.awt.Color(102, 102, 102));
        addCarPanelLabel.setFont(new java.awt.Font("SansSerif", 2, 48)); // NOI18N
        addCarPanelLabel.setForeground(new java.awt.Color(0, 0, 0));
        addCarPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addCarPanelLabel.setText("ADD CAR PANEL");
        addCarPanelLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(addCarPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 490, 60));

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

        fuelTypejComboBox.setBackground(new java.awt.Color(153, 153, 153));
        fuelTypejComboBox.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        fuelTypejComboBox.setForeground(new java.awt.Color(0, 0, 0));
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

        brandjComboBox.setBackground(new java.awt.Color(153, 153, 153));
        brandjComboBox.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        brandjComboBox.setForeground(new java.awt.Color(0, 0, 0));
        brandjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(brandjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 180, 40));

        typeLabel.setBackground(new java.awt.Color(153, 153, 153));
        typeLabel.setForeground(new java.awt.Color(0, 0, 0));
        typeLabel.setText("Type :");
        typeLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 180, 40));

        txtPrice.setForeground(new java.awt.Color(0, 0, 0));
        txtPrice.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 180, 40));

        txtModel.setForeground(new java.awt.Color(0, 0, 0));
        txtModel.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtModel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModelKeyReleased(evt);
            }
        });
        add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 180, 40));

        typejComboBox.setBackground(new java.awt.Color(153, 153, 153));
        typejComboBox.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        typejComboBox.setForeground(new java.awt.Color(0, 0, 0));
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

        yearjComboBox.setBackground(new java.awt.Color(153, 153, 153));
        yearjComboBox.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        yearjComboBox.setForeground(new java.awt.Color(0, 0, 0));
        yearjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(yearjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 180, 40));

        fuelTypeLabel.setBackground(new java.awt.Color(153, 153, 153));
        fuelTypeLabel.setForeground(new java.awt.Color(0, 0, 0));
        fuelTypeLabel.setText("Fuel Type :");
        fuelTypeLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 28)); // NOI18N
        add(fuelTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 180, 40));

        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        txtColor.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtColorKeyReleased(evt);
            }
        });
        add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 180, 40));

        addCarButton.setBackground(new java.awt.Color(0, 0, 0));
        addCarButton.setForeground(new java.awt.Color(255, 255, 255));
        addCarButton.setText("Add Car");
        addCarButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        addCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarButtonActionPerformed(evt);
            }
        });
        add(addCarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 150, -1));
        add(modelIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, -1, 40));
        add(colorIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, -1, 40));
        add(priceIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getDealerManageCarPanel());
    }//GEN-LAST:event_backButtonActionPerformed

    private void addCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarButtonActionPerformed
        Dealer dealer = (Dealer) MainFrame.instance.getAccount();
        if (txtModel.getText().equals("") || txtColor.getText().equals("") || txtPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Fill All Entries.",
                    "Failure", JOptionPane.ERROR_MESSAGE);

            return;
        } else if (flagForColorLabel == true && flagForModelLabel == true && flagForPriceLabel == true) {
            if ((JOptionPane.showConfirmDialog(this, "Do you really want to add this car to your account? ",
                    "Are You Sure ?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
                Car car = new Car(dealer, null, brandjComboBox.getSelectedItem().toString(), txtModel.getText(),
                        txtColor.getText(), typejComboBox.getSelectedItem().toString(), fuelTypejComboBox.getSelectedItem().toString(),
                        yearjComboBox.getSelectedItem().toString(), txtPrice.getText());

                Database.getCars().add(car);
                dealer.getListedCars().add(car);
                JOptionPane.showMessageDialog(this, "Successfully Created A Car ",
                        "Operation Successful", JOptionPane.INFORMATION_MESSAGE);
                brandjComboBox.setSelectedIndex(0);
                txtModel.setText("");
                typejComboBox.setSelectedIndex(0);
                txtColor.setText("");
                yearjComboBox.setSelectedIndex(0);
                fuelTypejComboBox.setSelectedIndex(0);
                txtPrice.setText("");

                modelIconLabel.setIcon(null);
                colorIconLabel.setIcon(null);
                priceIconLabel.setIcon(null);

                MainFrame.instance.setPage(MainFrame.instance.getDealerManageCarPanel());
            }
        } else {
            JOptionPane.showMessageDialog(this, "There was a validation error, please enter only a letter"
                    + " for the model and color, and a maximum of 9 digits for the price.",
                    "The Gaps Were Not Filled As Desired.", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_addCarButtonActionPerformed

    private void txtModelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModelKeyReleased
        String phoneNo = txtModel.getText();
        String regex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNo);

        if (matcher.matches()) {
            ImageIcon verifiedIcon = new ImageIcon(getClass().getResource("/images/verifiedIcon.png"));
            modelIconLabel.setIcon(verifiedIcon);
            flagForModelLabel = true;
        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon(getClass().getResource("/images/nonVerifiedIcon.png"));
            modelIconLabel.setIcon(nonVerifiedIcon);
            flagForModelLabel = false;
        }
    }//GEN-LAST:event_txtModelKeyReleased

    private void txtColorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyReleased
        String color = txtColor.getText();
        String regex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(color);

        if (matcher.matches()) {
            ImageIcon verifiedIcon = new ImageIcon(getClass().getResource("/images/verifiedIcon.png"));
            colorIconLabel.setIcon(verifiedIcon);
            flagForColorLabel = true;
        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon(getClass().getResource("/images/nonVerifiedIcon.png"));
            colorIconLabel.setIcon(nonVerifiedIcon);
            flagForColorLabel = false;
        }
    }//GEN-LAST:event_txtColorKeyReleased

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        String price = txtPrice.getText();
        String regex = "\\d{1,9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(price);

        if (matcher.matches()) {
            ImageIcon verifiedIcon = new ImageIcon(getClass().getResource("/images/verifiedIcon.png"));
            priceIconLabel.setIcon(verifiedIcon);
            flagForPriceLabel = true;
        } else {
            ImageIcon nonVerifiedIcon = new ImageIcon(getClass().getResource("/images/nonVerifiedIcon.png"));
            priceIconLabel.setIcon(nonVerifiedIcon);
            flagForPriceLabel = false;
        }
    }//GEN-LAST:event_txtPriceKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.Button addCarButton;
    private javax.swing.JLabel addCarPanelLabel;
    private SwingComponents.Button backButton;
    private SwingComponents.Label brandLabel;
    private javax.swing.JComboBox<String> brandjComboBox;
    private javax.swing.JLabel colorIconLabel;
    private SwingComponents.Label colorLabel;
    private SwingComponents.Label fuelTypeLabel;
    private javax.swing.JComboBox<String> fuelTypejComboBox;
    private javax.swing.JLabel modelIconLabel;
    private SwingComponents.Label modelLabel;
    private javax.swing.JLabel priceIconLabel;
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

        flagForColorLabel = false;
        flagForModelLabel = false;
        flagForPriceLabel = false;

        txtModel.setText("");
        txtColor.setText("");
        txtPrice.setText("");

        modelIconLabel.setIcon(null);
        colorIconLabel.setIcon(null);
        priceIconLabel.setIcon(null);

        for (int i = 0; i < Car.carBrand.length; i++) {
            brandjComboBox.addItem(Car.carBrand[i]);
        }

        for (int i = 0; i < Car.carType.length; i++) {
            typejComboBox.addItem(Car.carType[i]);
        }

        for (int i = 2002; i <= 2023; i++) {
            yearjComboBox.addItem(i + "");
        }

        for (int i = 0; i < Car.carFuelType.length; i++) {
            fuelTypejComboBox.addItem(Car.carFuelType[i]);
        }

    }
}
