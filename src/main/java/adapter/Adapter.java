package adapter;

import adapter.service.Target;

public class Adapter implements Target {
    private final Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        adaptee.specificRequest();
    }

    @Override
    public void method() {
    }
}
