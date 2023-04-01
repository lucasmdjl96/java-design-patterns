package service;

public enum ConcreteStrategyB implements Strategy {
    INSTANCE;
    @Override
    public void execute(Context context) {
        context.setResult("Strategy B");
    }
}
