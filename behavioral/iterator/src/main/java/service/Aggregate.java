package service;

public interface Aggregate<E> {
    Iterator<E> createIterator();
}
