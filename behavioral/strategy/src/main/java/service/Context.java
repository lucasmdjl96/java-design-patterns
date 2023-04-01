package service;

public class Context {
    private final Strategy strategy;
    private String result;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public void compute() {
        strategy.execute(this);
    }
}
