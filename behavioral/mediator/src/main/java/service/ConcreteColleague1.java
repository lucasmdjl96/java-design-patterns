package service;

public class ConcreteColleague1 implements Colleague {
    private final Callback mediatorCallback;
    ConcreteColleague1(Callback mediatorCallback) {
        this.mediatorCallback = mediatorCallback;
    }
    @Override
    public Callback getMediatorCallback() {
        return mediatorCallback;
    }
    public void perform() {
        System.out.println("Doing something");
        changed();
    }
    void doSomething1() {
        System.out.println("Hello from a ConcreteColleague1");
    }
}
