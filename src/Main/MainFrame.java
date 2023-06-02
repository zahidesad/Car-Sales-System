package Main;

import CarSalesSystem.*;
import CorePackage.*;
import javax.swing.JPanel;
import login.LoginAndRegister;

/**
 *
 * @author zahid
 */
public class MainFrame extends javax.swing.JFrame {

    // --------------- VARIABLE DECLERATIONS ------------------
    public static MainFrame instance;

    private final MainPanel mainPanel;

    private final LoginAndRegister loginAndRegister;

    private final AdminControlPanel adminControlPanel;

    private final DealerControlPanel dealerControlPanel;
    private final DealerAccountDetailsPanel dealerAccountDetailsPanel;
    private final DealerManageCarPanel dealerManageCarPanel;
    private final DealerCustomerRequestsPanel dealerCustomerRequestsPanel;
    private final DealerAddCarPanel dealerAddCarPanel;
    private final DealerEditCarPanel dealerEditCarPanel;

    private final CustomerControlPanel customerControlPanel;
    private final CustomerCarListPanel customerCarListPanel;
    private final CustomerMyOrdersPanel customerMyOrdersPanel;
    private final CustomerAccountDetailsPanel customerAccountDetailsPanel;

    private final JPanel container;

    private User account;

    public MainFrame() {
        initComponents();

        // Initilize Variables
        mainPanel = new MainPanel();

        loginAndRegister = new LoginAndRegister();

        adminControlPanel = new AdminControlPanel();

        dealerControlPanel = new DealerControlPanel();
        dealerAccountDetailsPanel = new DealerAccountDetailsPanel();
        dealerManageCarPanel = new DealerManageCarPanel();
        dealerCustomerRequestsPanel = new DealerCustomerRequestsPanel();
        dealerAddCarPanel = new DealerAddCarPanel();
        dealerEditCarPanel = new DealerEditCarPanel();

        customerControlPanel = new CustomerControlPanel();
        customerCarListPanel = new CustomerCarListPanel();
        customerMyOrdersPanel = new CustomerMyOrdersPanel();
        customerAccountDetailsPanel = new CustomerAccountDetailsPanel();

        container = new JPanel();

        this.add(container);
        container.add(mainPanel);

        setSize(900, 565);
        setLocationRelativeTo(null); //// this method display the MainFrame to center position of a screen
        this.setResizable(false);

    }

    // --------------- ENCAPSULATE FIELDS ------------------
    public LoginAndRegister getLoginAndRegister() {
        return loginAndRegister;
    }

    public AdminControlPanel getAdminControlPanel() {
        return adminControlPanel;
    }

    public DealerControlPanel getDealerControlPanel() {
        return dealerControlPanel;
    }

    public DealerAccountDetailsPanel getDealerAccountDetailsPanel() {
        return dealerAccountDetailsPanel;
    }

    public DealerManageCarPanel getDealerManageCarPanel() {
        return dealerManageCarPanel;
    }

    public DealerCustomerRequestsPanel getDealerCustomerRequestsPanel() {
        return dealerCustomerRequestsPanel;
    }

    public DealerAddCarPanel getDealerAddCarPanel() {
        return dealerAddCarPanel;
    }

    public DealerEditCarPanel getDealerEditCarPanel() {
        return dealerEditCarPanel;
    }

    public CustomerControlPanel getCustomerControlPanel() {
        return customerControlPanel;
    }

    public CustomerCarListPanel getCustomerCarListPanel() {
        return customerCarListPanel;
    }

    public CustomerMyOrdersPanel getCustomerMyOrdersPanel() {
        return customerMyOrdersPanel;
    }

    public CustomerAccountDetailsPanel getCustomerAccountDetailsPanel() {
        return customerAccountDetailsPanel;
    }

    public MainPanel getMainPanel() {
        return mainPanel;
    }

    public User getAccount() {
        return account;
    }

    public void setAccount(User account) {
        this.account = account;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));

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
//                testInit();
                // ---------------- SINGLETON -----------------
                new Main.SplashScreen(null, true).setVisible(true);
                instance = new MainFrame();
                instance.setVisible(true);

            }
        });

    }

    // Method to set page transitions
    public final void setPage(JPanel page) {
        container.removeAll();
        container.add(page);
        container.revalidate();
        container.repaint();
        System.out.println("Page Setted!");

        if (page instanceof ITriggerer) {
            ITriggerer iTriggerer = (ITriggerer) page;
            iTriggerer.PageOn();
        }
    }

    //Method to log out and redirect the logged out user back to the login and register page.
    public void logOut() {
        account = null;
        setPage(getMainPanel());
    }

    //Method for default account
//    public static void testInit() {
//        //Default admin account
//        Admin admin = new Admin("admin", "Admin123$", "Zahid",
//                "zahid.bltci@gmail.com", "536-066-6561");
//
//        //Default dealer accounts
//        Dealer dealer1 = new Dealer("emirhan", "Emirhan123$", "Emirhan",
//                "emirhan.soylu@gmail.com", "506-364-0557");
//        Dealer dealer2 = new Dealer("meryem", "Meryem123$", "Meryem",
//                "meryem.kilic@gmail.com", "551-136-5622");
//
//        //Default customer accounts
//        Customer customer1 = new Customer("sare", "Sare123$", "Sare",
//                "rumeysasare.bayram@gmail.com", "542-592-3130");
//        Customer customer2 = new Customer("asim", "Asim123$", "Asım",
//                "asimtarik.kutluer@gmail.com", "507-000-8134");
//
//        //Default cars
//        Car car1 = new Car(dealer1, null, "Togg",
//                "T10X", "Red", "SUV", "Electric", "2023", "500.000₺");
//
//        Car car2 = new Car(dealer2, customer2, "BMW",
//                "5.20", "Black", "Sedan", "Diesel", "2022", "700.000₺");
//
//        Database.getCars().add(car1);
//        Database.getCars().add(car2);
//
//        dealer1.getListedCars().add(car1);
//        dealer2.getListedCars().add(car2);
//
//        Database.getUsers().add(admin);
//        Database.getUsers().add(dealer1);
//        Database.getUsers().add(dealer2);
//        Database.getUsers().add(customer1);
//        Database.getUsers().add(customer2);
//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
