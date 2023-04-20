package SwingComponents;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class NavigationBar extends javax.swing.JPanel {

    private Animator animator;
    private double currentX = 0;
    private double targetX;
    private double lastTargetX = 0;
    private float down = 0.1f;
    private List<ModelNavigationBar> item;
    private int selectedIndex = -1;
    private int oldSelectedIndex = -1;
    private double animationIcon;
    private double animationIconBack;
    private int animationIconTarget = 18;
    private List<EventNavigationBar> events;

    public NavigationBar() {
        setOpaque(false);
        setBackground(Color.GRAY);
        setForeground(new Color(71, 161, 225));
        item = new ArrayList<>();
        events = new ArrayList<>();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    if (!animator.isRunning()) {
                        int index = getSelectedIndex(me.getPoint());
                        if (index != -1 && index != selectedIndex) {
                            oldSelectedIndex = selectedIndex;
                            selectedIndex = index;
                            setSelectedIndex(index);
                        }
                    }
                }
            }

        });
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                currentX = (targetX - lastTargetX) * fraction;
                currentX += lastTargetX;
                animationIcon = fraction * animationIconTarget;
                animationIconBack = (1f - fraction) * animationIconTarget;
                if (fraction <= 0.5f) {
                    down = -fraction + 0.1f;
                } else {
                    down = fraction - 1f + 0.1f;
                }
                repaint();
            }

            @Override
            public void end() {
                lastTargetX = targetX;
                runAfterEvent();
            }
        };
        animator = new Animator(500, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
    }

    public void addItem(Icon icon) {
        item.add(new ModelNavigationBar(icon, item.size(), null));
        repaint();
    }

    private int getSelectedIndex(Point mouse) {
        for (ModelNavigationBar i : item) {
            if (i.getRec().contains(mouse)) {
                return i.getIndex();
            }
        }
        return -1;
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        int width = getWidth();
        int height = getHeight();
        double itemSize = height / 2;
        double itemY = ((height - itemSize) / 2) + (down * itemSize);
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRect(0, height / 2, width, height - height / 2);
        if (selectedIndex >= 0) {
            g2.setComposite(AlphaComposite.Clear);
            double x = currentX;
            double y = ((height - itemSize) / 2) + (0.1f * itemSize);
            g2.setColor(Color.GRAY);
            g2.fill(createBorder(x, y, itemSize, down));
            g2.setComposite(AlphaComposite.SrcOver);
            g2.setColor(getForeground());
            g2.fillOval((int) currentX, (int) (int) itemY, (int) itemSize, (int) itemSize);
        }
        createItem(g2);
        grphcs.drawImage(img, 0, 0, null);
    }

    private void createItem(Graphics2D g2) {
        if (item.size() > 0) {
            int width = getWidth() - (getHeight());
            int height = getHeight() / 2;
            int itemCount = item.size();
            double space = width / itemCount;
            int x = height;
            int y = height;
            for (ModelNavigationBar d : item) {
                d.setRec(new Rectangle(x, y, (int) space, height));
                int iconWidth = d.getIcon().getIconWidth();
                int iconHeight = d.getIcon().getIconHeight();
                double iconX = (space - iconWidth) / 2;
                double iconY = (height - iconHeight) / 2;
                g2.drawImage(((ImageIcon) d.getIcon()).getImage(), x + (int) iconX, (int) (y + iconY - (d.getIndex() == selectedIndex ? animationIcon : d.getIndex() == oldSelectedIndex ? animationIconBack : 0)), null);
                x += space;
            }
        }
    }

    private Shape createBorder(double x, double y, double size, double s) {
        double center = getHeight() / 2;
        double sizeX = 1.5f * size;
        double height = y + size + (size * (0.1f + s - 0.1f));
        double space = 0.1 * size;
        GeneralPath g_left = new GeneralPath(new CubicCurve2D.Double(x - sizeX, center, x + size / 3, center, x - sizeX / 4, height, x + space + size / 2, height));
        g_left.lineTo(x + size / 2, center);
        Area left = new Area(g_left);
        left.subtract(new Area(new Rectangle2D.Double(x + size / 2, center, x + size, height)));
        GeneralPath g_right = new GeneralPath(new CubicCurve2D.Double(x - space + size / 2, height, x + size + sizeX / 4, height, x + size - size / 3, center, x + size + sizeX, center));
        g_right.lineTo(x + size / 2, center);
        Area right = new Area(g_right);
        right.subtract(new Area(new Rectangle2D.Double(x, center, size / 2, size)));
        Area area = new Area(left);
        area.add(new Area(right));
        return area;
    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
        double itemSize = getHeight() / 2;
        animationIconTarget = (int) (getHeight() - (0.82 * getHeight()));
        if (!animator.isRunning()) {
            animationIcon = 1f * animationIconTarget;
        }
        if (selectedIndex >= 0) {
            if (!animator.isRunning()) {
                ModelNavigationBar d = item.get(selectedIndex);
                currentX = (int) ((d.getRec().x + (d.getRec().width / 2)) - (itemSize / 2));
                lastTargetX = currentX;
                repaint();
            }
        }
    }

    public int getSelectedIndex() {
        return selectedIndex;
    }

    public void setSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
        double itemSize = getHeight() / 2;
        if (selectedIndex >= 0) {
            if (!animator.isRunning()) {
                ModelNavigationBar d = item.get(selectedIndex);
                targetX = (int) ((d.getRec().x + (d.getRec().width / 2)) - (itemSize / 2));
                runBeforeEvent();
                animator.start();
            }
        }
    }

    public void initSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
        double itemSize = getHeight() / 2;
        if (selectedIndex >= 0) {
            if (!animator.isRunning()) {
                ModelNavigationBar d = item.get(selectedIndex);
                targetX = (int) ((d.getRec().x + (d.getRec().width / 2)) - (itemSize / 2));
                currentX = targetX;
                lastTargetX = targetX;
                animationIcon = 1f * animationIconTarget;
                animator.start();
                repaint();
                runBeforeEvent();
            }
        }
    }

    private void runBeforeEvent() {
        for (EventNavigationBar event : events) {
            event.beforeSelected(selectedIndex);
        }
    }

    private void runAfterEvent() {
        for (EventNavigationBar event : events) {
            event.afterSelected(selectedIndex);
        }
    }

    public void addEvent(EventNavigationBar event) {
        this.events.add(event);
    }

    public Animator getAnimator() {
        return animator;
    }

    public void setnavigationBackgroundColor(NavigationBackgroundColor nb) {
        addEvent(new EventNavigationBar() {
            @Override
            public void beforeSelected(int index) {
                animator.removeTarget(nb.getTarget());
                animator.addTarget(nb.createTarget(oldSelectedIndex, index));
            }

            @Override
            public void afterSelected(int index) {

            }
        });
    }
}
