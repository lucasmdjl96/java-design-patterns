import service.*;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder<Product1> builder1 = new ConcreteBuilder1();
        director.construct(builder1);
        Product1 product1 = builder1.getResult();
        Builder<Product2> builder2 = new ConcreteBuilder2();
        director.construct(builder2);
        Product2 product2 = builder2.getResult();
    }
}
