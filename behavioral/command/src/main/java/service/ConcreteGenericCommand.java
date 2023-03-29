package service;

import java.util.function.Consumer;

public class ConcreteGenericCommand<T> implements Command {
    private final T receiver;
    private final Consumer<T> action;
    public ConcreteGenericCommand(T receiver, Consumer<T> action) {
        this.receiver = receiver;
        this.action = action;
    }
    @Override
    public void execute() {
        action.accept(receiver);
    }
}
