package Main;

import SwingComponents.EventNavigationBar;
import javax.swing.ImageIcon;
import login.LoginAndRegister;

/**
 *
 * @author zahid
 */
public class MainPanel extends javax.swing.JPanel {
    
    public MainPanel() {
        initComponents();
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/images/account.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/images/termsAndConditions.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/images/validation.png")));

        navigationBar1.addEvent(new EventNavigationBar() {
            
            @Override
            public void beforeSelected(int index) {
                if (index == 0) {
                    panelTransitions1.display(new LoginAndRegister(),navigationBar1.getAnimator());
                }else if (index == 1){
                    panelTransitions1.display(new TermsAndConditions(),navigationBar1.getAnimator());
                }else if (index == 2){
                    panelTransitions1.display(new ValidationRules(),navigationBar1.getAnimator());
                }
            }
            
            @Override
            public void afterSelected(int index) {
                
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationBar1 = new SwingComponents.NavigationBar();
        panelTransitions1 = new SwingComponents.PanelTransitions();

        setPreferredSize(new java.awt.Dimension(900, 529));

        navigationBar1.setBackground(new java.awt.Color(246, 207, 104));

        javax.swing.GroupLayout navigationBar1Layout = new javax.swing.GroupLayout(navigationBar1);
        navigationBar1.setLayout(navigationBar1Layout);
        navigationBar1Layout.setHorizontalGroup(
            navigationBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        navigationBar1Layout.setVerticalGroup(
            navigationBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTransitions1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(navigationBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelTransitions1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navigationBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingComponents.NavigationBar navigationBar1;
    private SwingComponents.PanelTransitions panelTransitions1;
    // End of variables declaration//GEN-END:variables
}
