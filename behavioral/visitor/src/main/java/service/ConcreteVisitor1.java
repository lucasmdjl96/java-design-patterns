package service;

public class ConcreteVisitor1 implements Visitor {
    private int count = 0;
    public int getCount() {
        return count;
    }
    @Override
    public void visit(CompositeElement element) {}
    @Override
    public void visit(ConcreteElementA element) {
        count++;
    }
    @Override
    public void visit(ConcreteElementB element) {
        count++;
    }
}
