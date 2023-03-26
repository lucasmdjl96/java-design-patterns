package service;

public interface Builder<T> {
    default void buildPartA() {}
    default void buildPartB() {}
    default void buildPartC() {}
    T getResult();
}
