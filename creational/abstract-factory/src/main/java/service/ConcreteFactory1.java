package service;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

enum ConcreteFactory1 implements AbstractFactory {
    INSTANCE;
    @Contract(value = " -> new", pure = true)
    @Override
    public @NotNull AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }
    @Contract(value = " -> new", pure = true)
    @Override
    public @NotNull AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
