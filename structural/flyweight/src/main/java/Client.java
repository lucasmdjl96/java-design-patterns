import service.*;

public class Client {
    public static void main(String[] args) {
        ConcreteShareableFlyweight.IntrinsicState intrinsicState =
                new ConcreteShareableFlyweight.IntrinsicState();
        Flyweight shareableFlyweight = FlyweightFactory.INSTANCE.getFlyweight(intrinsicState);
        Flyweight.ExtrinsicState externalState = new Flyweight.ExtrinsicState() {};
        shareableFlyweight.operation(externalState);

        UnshareableFlyweight unshareableFlyweight =
                FlyweightFactory.INSTANCE.getFlyWeight(new ConcreteUnshareableFlyweight.AllState());
        unshareableFlyweight.operation();
    }
}
