package service;

public class Context {
    private State state;
    public Context(State state) {
        this.state = state;
    }
    void setState(State state) {
        this.state = state;
    }
    public void handle() {
        state.handle(this);
    }
}
