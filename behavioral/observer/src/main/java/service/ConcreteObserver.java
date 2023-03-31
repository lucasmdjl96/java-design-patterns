package service;

import org.jetbrains.annotations.NotNull;

public class ConcreteObserver implements Observer<ConcreteSubject> {
    @Override
    public void update(@NotNull ConcreteSubject subject) {
        System.out.println(subject.getState());
    }
}
