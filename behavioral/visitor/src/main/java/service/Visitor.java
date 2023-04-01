package service;

public interface Visitor {
    void visit(CompositeElement element);
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
