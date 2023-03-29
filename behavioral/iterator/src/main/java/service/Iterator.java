package service;

public interface Iterator<E> {
    void first();
    void next();
    boolean isDone();
    E currentItem();
}
