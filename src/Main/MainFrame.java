package Main;

import CarSalesSystem.*;
import CorePackage.*;
import SwingComponents.EventLogin;
import javax.swing.JPanel;

/**
 *
 * @author zahid
 */
public class MainFrame extends javax.swing.JFrame {

    public static User account;

    public static EventLogin event;

    public static AdminControlPanel adminControlPanel;

    public static DealerControlPanel dealerControlPanel;
    public static DealerAccountDetailsPanel dealerAccountDetailsPanel;
    public static DealerManageVehiclePanel dealerManageVehiclePanel;
    public static DealerCustomerRequestsPanel dealerCustomerRequestsPanel;

    public static CustomerControlPanel customerControlPanel;
    public static CustomerVehicleListPanel customerVehicleListPanel;
    public static CustomerMyOrdersPanel customerMyOrdersPanel;
    public static CustomerAccountDetailsPanel customerAccountDetailsPanel;

    public MainFrame() {
        initComponents();

        adminControlPanel = new AdminControlPanel();

        dealerControlPanel = new DealerControlPanel();
        dealerAccountDetailsPanel = new DealerAccountDetailsPanel();
        dealerManageVehiclePanel = new DealerManageVehiclePanel();
        dealerCustomerRequestsPanel = new DealerCustomerRequestsPanel();

        customerControlPanel = new CustomerControlPanel();
        customerVehicleListPanel = new CustomerVehicleListPanel();
        customerMyOrdersPanel = new CustomerMyOrdersPanel();
        customerAccountDetailsPanel = new CustomerAccountDetailsPanel();

        event = new EventLogin() {

            @Override
            public void logOut() {
                main.removeAll();
                main.add(loginAndRegister1);
                main.revalidate();
                main.repaint();
            }

            @Override
            public void setPage(JPanel panel) {
                main.removeAll();
                main.add(panel);
                main.revalidate();
                main.repaint();
            }
        };

        loginAndRegister1.setEventLogin(event);

        adminControlPanel.setEventLogin(event);

        dealerControlPanel.setEventLogin(event);
        dealerAccountDetailsPanel.setEventLogin(event);
        dealerManageVehiclePanel.setEventLogin(event);
        dealerCustomerRequestsPanel.setEventLogin(event);

        customerControlPanel.setEventLogin(event);
        customerVehicleListPanel.setEventLogin(event);
        customerMyOrdersPanel.setEventLogin(event);
        customerAccountDetailsPanel.setEventLogin(event);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        loginAndRegister1 = new login.LoginAndRegister();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));

        main.setLayout(new java.awt.BorderLayout());
        main.add(loginAndRegister1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                testInit();
                new MainFrame().setVisible(true);

            }
        });

    }

    public static void testInit() {
        //Default admin account
        Admin admin = new Admin("admin", "123", "Zahid",
                "zahidesad.baltaci@stu.fsm.edu.tr", "05360666561");

        //Default dealer accounts
        Dealer dealer1 = new Dealer("emirhan", "123", "Emirhan",
                "emirhan.soylu@stu.fsm.edu.tr", "05063640557");
        Dealer dealer2 = new Dealer("meryem", "123", "Meryem",
                "meryem.kilic@stu.fsm.edu.tr", "05511365622");

        //Default customer accounts
        Customer customer1 = new Customer("saresu", "123", "Sare",
                "rumeysasare.bayram@stu.fsm.edu.tr", "05425923130");
        Customer customer2 = new Customer("asim", "123", "Asım",
                "asimtarik.kutluer@stu.fsm.edu.tr", "05070008134");

        //Default vehicles
        Vehicle vehicle1 = new Vehicle(dealer1, null, "Togg",
                "SUV", "Red", "SUV", "Electric", "2023", "500000₺");

        Database.getVehicles().add(vehicle1);
        dealer1.getListedVehicles().add(vehicle1);

        Database.getUsers().add(admin);
        Database.getUsers().add(dealer1);
        Database.getUsers().add(dealer2);
        Database.getUsers().add(customer1);
        Database.getUsers().add(customer2);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private login.LoginAndRegister loginAndRegister1;
    public static javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
