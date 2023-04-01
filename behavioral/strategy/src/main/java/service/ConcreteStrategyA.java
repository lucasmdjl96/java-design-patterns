package service;

public enum ConcreteStrategyA implements Strategy {
    INSTANCE;
    @Override
    public void execute(Context context) {
        context.setResult("Strategy A");
    }
}
