package service;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    private void addedBehavior() {
        System.out.println("finished");
    }
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }
}
