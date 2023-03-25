package factorymethod;

import factorymethod.service.Creator;
import factorymethod.service.Product;

class ConcreteCreator implements Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
