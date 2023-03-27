package service;

public class ConcreteShareableFlyweight implements Flyweight {
    @Override
    public void operation(ExtrinsicState extrinsicState) {
    }
    public static class IntrinsicState {}
    private final IntrinsicState intrinsicState;
    ConcreteShareableFlyweight(IntrinsicState intrinsicState) {
        this.intrinsicState = intrinsicState;
    }
}
