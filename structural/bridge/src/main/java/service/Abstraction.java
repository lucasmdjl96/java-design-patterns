package service;

import org.jetbrains.annotations.NotNull;

public abstract class Abstraction {
    private Implementor implementor = new ConcreteImplementorA(); // default
    public void operation() {
        implementor.operationImpl();
    }
    public void chooseImplementor(@NotNull ImplementorType implementorType) {
        switch (implementorType) {
            case IMPLEMENTOR_A -> implementor = new ConcreteImplementorA();
            case IMPLEMENTOR_B -> implementor = new ConcreteImplementorB();
        }
    }
    public enum ImplementorType {
        IMPLEMENTOR_A,
        IMPLEMENTOR_B
    }
}
