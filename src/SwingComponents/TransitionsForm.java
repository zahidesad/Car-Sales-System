package SwingComponents;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class TransitionsForm extends javax.swing.JPanel {

    public void setAlpha(float alpha) {
        this.alpha = alpha;
        repaint();
    }

    private JComponent body;
    private Animator animator;
    private TimingTarget target;
    private float alpha = 1f;
    private boolean show = true;

    public TransitionsForm() {
        initComponents();
        setOpaque(false);
        target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (show) {
                    setAlpha(fraction);
                    repaint();
                } else {
                    setAlpha(1f - fraction);
                    repaint();
                }
            }

            @Override
            public void end() {
                if (!show) {
                    animator.removeTarget(target);
                    body.remove(TransitionsForm.this);
                    body.repaint();
                    body.revalidate();
                }
            }
        };
    }

    public void addTarget(Animator animator, JComponent body) {
        alpha = 0;
        this.animator = animator;
        this.body = body;
        animator.addTarget(target);
    }

    public void removeTarget() {
        show = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(900, 529));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        super.paint(grphcs);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
