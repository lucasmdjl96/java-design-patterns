package service;

public class ConcreteAggregate<E> implements Aggregate<E> {
    private final E value1;
    private final E value2;
    public ConcreteAggregate(E value1, E value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public E getValue1() {
        return value1;
    }
    public E getValue2() {
        return value2;
    }
    @Override
    public Iterator<E> createIterator() {
        return new ConcreteIterator<>(this);
    }
}
