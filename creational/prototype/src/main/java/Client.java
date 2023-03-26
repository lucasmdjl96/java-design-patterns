import service.Prototype;
import service.PrototypeManager;

public class Client {
    public static void main(String[] args) {
        Prototype<Product1> prototype1 = new ConcretePrototype1(4);
        Product1 product1 = prototype1.deepCopy();
        Prototype<Product2> prototype2 = new ConcretePrototype2("Hi");
        Product2 product2 = prototype2.deepCopy(p -> p.setData("Hello"));

        // Using PrototypeManager
        PrototypeManager.register(Product1.class, new ConcretePrototype1(3));
        PrototypeManager.register(Product2.class, new ConcretePrototype2("Hey"));
        Product1 product11 = PrototypeManager.getProduct(Product1.class, p -> p.setData(2));
        Product2 product21 = PrototypeManager.getProduct(Product2.class);
    }
}
