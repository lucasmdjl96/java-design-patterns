package service;

public class GeneralObserver implements Observer<Subject<?>> {
    @Override
    public void update(Subject<?> subject) {
        System.out.println("Hello world!");
    }
}
