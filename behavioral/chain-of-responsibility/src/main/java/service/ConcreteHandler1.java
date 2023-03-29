package service;

import java.util.concurrent.ThreadLocalRandom;

public class ConcreteHandler1 implements Handler {
    private Handler successor;
    public ConcreteHandler1() {}
    public ConcreteHandler1(Handler successor) {
        this.successor = successor;
    }
    @Override
    public Handler successor() {
        return successor;
    }
    @Override
    public Handler successor(Handler successor) {
        return this.successor = successor;
    }
    @Override
    public boolean canHandle(Request request) {
        int i = ThreadLocalRandom.current().nextInt(0, 2);
        return i == 0;
    }
    @Override
    public void doHandle(Request request) {
        System.out.println("Request handled by ConcreteHandler1");
    }
}
