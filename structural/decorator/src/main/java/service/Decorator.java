package service;

public abstract class Decorator implements Component {
    private final Component component;
    protected Decorator(Component component) {
        this.component = component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}
