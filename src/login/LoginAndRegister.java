package login;

import CorePackage.ITriggerer;
import SwingComponents.TransitionsForm;

/**
 *
 * @author zahid
 */
public class LoginAndRegister extends TransitionsForm implements ITriggerer {

    public LoginAndRegister() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginAndRegisterDesign1 = new login.LoginAndRegisterDesign();

        setPreferredSize(new java.awt.Dimension(900, 529));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginAndRegisterDesign1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginAndRegisterDesign1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void PageOn() {
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private login.LoginAndRegisterDesign loginAndRegisterDesign1;
    // End of variables declaration//GEN-END:variables
}
