package service;


public interface AbstractFactory {
    default AbstractProductA createProductA() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    default AbstractProductB createProductB() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    /*
    Factory method design pattern for creating factories. In this case
    AbstractFactory plays the role of Product and Type plays the role of Creator.
    */
    enum Type {
        FACTORY_1(ConcreteFactory1.INSTANCE),
        FACTORY_2(ConcreteFactory2.INSTANCE);
        private final AbstractFactory factory;
        Type(AbstractFactory factory) {
            this.factory = factory;
        }
        public AbstractFactory get() {
            return factory;
        }
    }
}
