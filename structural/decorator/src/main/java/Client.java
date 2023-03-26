import service.Component;
import service.ConcreteComponent;
import service.ConcreteDecoratorA;
import service.ConcreteDecoratorB;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decoratedComponent = new ConcreteDecoratorA(new ConcreteDecoratorB(component));
        decoratedComponent.operation();
    }
}
