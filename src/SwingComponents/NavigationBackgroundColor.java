package SwingComponents;

import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.interpolation.PropertySetter;

public class NavigationBackgroundColor {

    public TimingTarget getTarget() {
        return target;
    }

    private TimingTarget target;
    private Color defaultColor;
    private Component component;
    private final Map<Integer, Color> colors;

    public NavigationBackgroundColor() {
        this.colors = new HashMap<>();
    }

    public void apply(Component component) {
        this.component = component;
        this.defaultColor = component.getBackground();
    }

    public void addColor(int index, Color color) {
        colors.put(index, color);
    }

    public TimingTarget createTarget(int oldIndex, int newIndex) {
        target = new PropertySetter(component, "background", getColor(oldIndex), getColor(newIndex));
        return target;
    }

    private Color getColor(int index) {
        if (colors.containsKey(index)) {
            return colors.get(index);
        } else {
            return defaultColor;
        }
    }
}
