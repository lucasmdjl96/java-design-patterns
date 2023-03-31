package service;

public interface Observer<T extends Subject<?>> {
    void update(T subject);
}
