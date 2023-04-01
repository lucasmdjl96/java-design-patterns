package service;

import org.jetbrains.annotations.NotNull;

public class ConcreteElementB implements Element {
    private final int stateB;
    public ConcreteElementB(int stateB) {
        this.stateB = stateB;
    }
    public int getStateB() {
        return stateB;
    }
    @Override
    public void accept(@NotNull Visitor visitor) {
        visitor.visit(this);
    }
}
