package service;


public class ConcreteColleague2 implements Colleague {
    private final Callback mediatorCallback;
    ConcreteColleague2(Callback mediatorCallback) {
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
    void doSomething2() {
        System.out.println("Hello from a ConcreteColleague2");
    }
}
