package service;

public class ConcreteClass extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("Operation 1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("Operation 2");
    }

    @Override
    protected void hookOperation() {
        System.out.println("Hook!");
    }
}
