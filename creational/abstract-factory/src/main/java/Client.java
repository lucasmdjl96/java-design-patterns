import service.AbstractFactory;
import service.AbstractProductA;
import service.AbstractProductB;

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = AbstractFactory.Type.FACTORY_1.get();
        AbstractProductA abstractProductA1 = abstractFactory1.createProductA();
        AbstractProductB abstractProductB1 = abstractFactory1.createProductB();
        AbstractFactory abstractFactory2 = AbstractFactory.Type.FACTORY_2.get();
        AbstractProductA abstractProductA2 = abstractFactory2.createProductA();
        AbstractProductB abstractProductB2 = abstractFactory2.createProductB();
    }
}
