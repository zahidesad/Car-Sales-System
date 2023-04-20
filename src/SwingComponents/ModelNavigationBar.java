package SwingComponents;

import java.awt.Rectangle;
import javax.swing.Icon;

public class ModelNavigationBar {

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Rectangle getRec() {
        return rec;
    }

    public void setRec(Rectangle rec) {
        this.rec = rec;
    }

    public ModelNavigationBar(Icon icon, int index, Rectangle rec) {
        this.icon = icon;
        this.index = index;
        this.rec = rec;
    }

    public ModelNavigationBar() {
    }

    private Icon icon;
    private int index;
    private Rectangle rec;

}
