package service;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject<ConcreteSubject> {
    private final List<Observer<? super ConcreteSubject>> observers = new ArrayList<>();
    @Override
    public List<Observer<? super ConcreteSubject>> getObservers() {
        return observers;
    }
    @Override
    public ConcreteSubject self() {
        return this;
    }

    private String state = "";
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
