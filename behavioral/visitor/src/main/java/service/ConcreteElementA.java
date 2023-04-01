package service;

import org.jetbrains.annotations.NotNull;

public class ConcreteElementA implements Element {
    private final int stateA;
    public ConcreteElementA(int stateA) {
        this.stateA = stateA;
    }
    public int getStateA() {
        return stateA;
    }
    @Override
    public void accept(@NotNull Visitor visitor) {
        visitor.visit(this);
    }
}
