package service;

public class ConcreteUnshareableFlyweight implements UnshareableFlyweight {
    @Override
    public void operation(ExtrinsicState extrinsicState) {
    }
    @Override
    public void operation() {
        operation(allState);
    }
    public static class AllState implements ExtrinsicState {}
    private final AllState allState;
    ConcreteUnshareableFlyweight(AllState allState) {
        this.allState = allState;
    }
}
