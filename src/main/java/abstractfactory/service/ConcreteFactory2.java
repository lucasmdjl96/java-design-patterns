package abstractfactory.service;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

enum ConcreteFactory2 implements AbstractFactory {
    INSTANCE;
    @Contract(value = " -> new", pure = true)
    @Override
    public @NotNull AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }
    @Contract(value = " -> new", pure = true)
    @Override
    public @NotNull AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
