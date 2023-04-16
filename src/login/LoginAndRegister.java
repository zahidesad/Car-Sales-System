package login;

import CorePackage.ITriggerer;

/**
 *
 * @author zahid
 */
public class LoginAndRegister extends javax.swing.JPanel implements ITriggerer{

    
    public LoginAndRegister() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginAndRegisterDesign1 = new login.LoginAndRegisterDesign();

        setPreferredSize(new java.awt.Dimension(900, 529));
        setLayout(new java.awt.BorderLayout());

        loginAndRegisterDesign1.setMinimumSize(new java.awt.Dimension(900, 529));
        loginAndRegisterDesign1.setPreferredSize(new java.awt.Dimension(900, 529));
        add(loginAndRegisterDesign1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private login.LoginAndRegisterDesign loginAndRegisterDesign1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PageOn() {
        
    }
}
