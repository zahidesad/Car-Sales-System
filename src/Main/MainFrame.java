package Main;

import CarSalesSystem.*;
import CorePackage.ITriggerer;
import JPA_Classes.*;
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
    private final DealerEditAccountDetailsPanel dealerEditAccountDetailsPanel;
    private final DealerChangePasswordPanel dealerChangePasswordPanel;

    private final CustomerControlPanel customerControlPanel;
    private final CustomerCarListPanel customerCarListPanel;
    private final CustomerMyOrdersPanel customerMyOrdersPanel;
    private final CustomerAccountDetailsPanel customerAccountDetailsPanel;
    private final CustomerEditAccountDetailsPanel customerEditAccountDetailsPanel;
    private final CustomerChangePasswordPanel customerChangePasswordPanel;

    private final JPanel container;

    private Users account;

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
        dealerEditAccountDetailsPanel = new DealerEditAccountDetailsPanel();
        dealerChangePasswordPanel = new DealerChangePasswordPanel();

        customerControlPanel = new CustomerControlPanel();
        customerCarListPanel = new CustomerCarListPanel();
        customerMyOrdersPanel = new CustomerMyOrdersPanel();
        customerAccountDetailsPanel = new CustomerAccountDetailsPanel();
        customerEditAccountDetailsPanel = new CustomerEditAccountDetailsPanel();
        customerChangePasswordPanel = new CustomerChangePasswordPanel();

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

    public DealerEditAccountDetailsPanel getDealerEditAccountDetailsPanel() {
        return dealerEditAccountDetailsPanel;
    }

    public DealerChangePasswordPanel getDealerChangePasswordPanel() {
        return dealerChangePasswordPanel;
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

    public CustomerEditAccountDetailsPanel getCustomerEditAccountDetailsPanel() {
        return customerEditAccountDetailsPanel;
    }

    public CustomerChangePasswordPanel getCustomerChangePasswordPanel() {
        return customerChangePasswordPanel;
    }

    public MainPanel getMainPanel() {
        return mainPanel;
    }

    public Users getAccount() {
        return account;
    }

    public void setAccount(Users account) {
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

        if (page instanceof ITriggerer iTriggerer) {
            iTriggerer.PageOn();
        }
    }

    //Method to log out and redirect the logged out user back to the login and register page.
    public void logOut() {
        account = null;
        setPage(getMainPanel());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
