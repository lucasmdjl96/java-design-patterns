package factorymethod;

import factorymethod.service.Creator;
import factorymethod.service.Product;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
    }
}
