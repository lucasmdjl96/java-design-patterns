package abstractfactory.service;


import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public interface AbstractFactory {
    default AbstractProductA createProductA() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    default AbstractProductB createProductB() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    static AbstractFactory getFactory(@NotNull Type type) {
        return type.supplier.get();
    }

    enum Type {
        FACTORY_1(() -> ConcreteFactory1.INSTANCE),
        FACTORY_2(() -> ConcreteFactory2.INSTANCE);
        private final Supplier<AbstractFactory> supplier;
        Type(Supplier<AbstractFactory> supplier) {
            this.supplier = supplier;
        }
    }
}
