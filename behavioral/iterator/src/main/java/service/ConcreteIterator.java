package service;

import java.util.NoSuchElementException;

public class ConcreteIterator<E> implements Iterator<E> {
    private final ConcreteAggregate<E> aggregate;
    private int i = -1;
    public ConcreteIterator(ConcreteAggregate<E> aggregate) {
        this.aggregate = aggregate;
    }
    @Override
    public void first() {
        i = 0;
    }
    @Override
    public void next() {
        i++;
    }
    @Override
    public boolean isDone() {
        return i == 2;
    }
    @Override
    public E currentItem() {
        if (i == 0)
            return aggregate.getValue1();
        else if (i == 1)
            return aggregate.getValue2();
        else
            throw new NoSuchElementException();
    }
}
