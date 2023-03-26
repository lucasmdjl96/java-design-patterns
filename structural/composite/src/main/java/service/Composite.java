package service;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private final List<Component> children = new ArrayList<>();
    @Override
    public void operation() {
        children.forEach(Component::operation);
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }
    @Override
    public void remove(Component component) {
        children.remove(component);
    }
    @Override
    public Component getChild(int n) {
        return children.get(n);
    }
}
