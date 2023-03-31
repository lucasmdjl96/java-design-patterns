package service;

import java.util.List;

public interface Subject<T extends Subject<?>> {
    List<Observer<? super T>> getObservers();
    T self();
    default void attach(Observer<? super T> observer) {
        getObservers().add(observer);
    }
    default void detach(Observer<? super T> observer) {
        getObservers().remove(observer);
    }
    default void notifyObservers() {
        for (Observer<? super T> observer : getObservers())
            observer.update(self());
    }
}
