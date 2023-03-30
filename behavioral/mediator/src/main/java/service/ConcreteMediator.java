package service;

public class ConcreteMediator implements Mediator {
    private final ConcreteColleague1 colleague1;
    private final ConcreteColleague2 colleague2;
    private final ConcreteColleague2 colleague3;
    private final ConcreteColleague1 colleague4;
    public ConcreteMediator() {
        colleague1 = new ConcreteColleague1(this::colleague1Changed);
        colleague2 = new ConcreteColleague2(this::colleague2Changed);
        colleague3 = new ConcreteColleague2(this::colleague3Changed);
        colleague4 = new ConcreteColleague1(this::colleague4Changed);
    }
    public ConcreteColleague1 getColleague1() {
        return colleague1;
    }
    public ConcreteColleague2 getColleague2() {
        return colleague2;
    }
    public ConcreteColleague2 getColleague3() {
        return colleague3;
    }
    public ConcreteColleague1 getColleague4() {
        return colleague4;
    }
    private void colleague1Changed() {
        System.out.println("Colleague 2 says:");
        colleague2.doSomething2();
    }
    private void colleague2Changed() {
        System.out.println("Colleague 3 says:");
        colleague3.doSomething2();
    }
    private void colleague3Changed() {
        System.out.println("Colleague 4 says:");
        colleague4.doSomething1();
    }
    private void colleague4Changed() {
        System.out.println("Colleague 1 says:");
        colleague1.doSomething1();
    }
}
