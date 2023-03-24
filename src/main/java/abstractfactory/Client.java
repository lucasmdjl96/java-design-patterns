package abstractfactory;

import abstractfactory.service.AbstractFactory;
import abstractfactory.service.AbstractProductA;
import abstractfactory.service.AbstractProductB;

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = AbstractFactory.getFactory(AbstractFactory.Type.FACTORY_1);
        AbstractProductA abstractProductA1 = abstractFactory1.createProductA();
        AbstractProductB abstractProductB1 = abstractFactory1.createProductB();
        AbstractFactory abstractFactory2 = AbstractFactory.getFactory(AbstractFactory.Type.FACTORY_2);
        AbstractProductA abstractProductA2 = abstractFactory2.createProductA();
        AbstractProductB abstractProductB2 = abstractFactory2.createProductB();
    }
}
