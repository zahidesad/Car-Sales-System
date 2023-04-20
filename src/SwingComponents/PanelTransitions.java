package SwingComponents;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JLayeredPane;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;

public class PanelTransitions extends javax.swing.JPanel {

    private JLayeredPane body;

    public PanelTransitions() {
        initComponents();
        setOpaque(false);
        setLayout(new MigLayout("fill", "0[fill]0", "0[fill]0"));
        body = new JLayeredPane();
        body.setLayout(new CardLayout());
        add(body);
    }

    public void display(Component form, Animator animator) {
        TransitionsForm add = (TransitionsForm) form;
        add.addTarget(animator, body);
        if (body.getComponentCount() > 0) {
            TransitionsForm remove = (TransitionsForm) body.getComponent(0);
            remove.removeTarget();
        } else {
            add.setAlpha(1f);
        }
        body.add(form);
        body.repaint();
        body.revalidate();
        form.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
