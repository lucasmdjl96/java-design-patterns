package service;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    private int state = 0;
    @Override
    public void operation() {
        System.out.println(state);
        super.operation();
        state++;
    }
}
