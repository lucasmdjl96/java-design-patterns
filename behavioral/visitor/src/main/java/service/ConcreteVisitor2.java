package service;

import org.jetbrains.annotations.NotNull;

public class ConcreteVisitor2 implements Visitor {
    private int count = 0;
    public int getCount() {
        return count;
    }
    @Override
    public void visit(CompositeElement element) {
        count *= 2;
    }
    @Override
    public void visit(@NotNull ConcreteElementA element) {
        count += element.getStateA();
    }
    @Override
    public void visit(@NotNull ConcreteElementB element) {
        count -= element.getStateB();
    }
}
