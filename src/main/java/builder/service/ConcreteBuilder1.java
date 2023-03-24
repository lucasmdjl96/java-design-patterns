package builder.service;

public class ConcreteBuilder1 implements Builder<Product1> {
    @Override
    public void buildPartB() {
        System.out.println("Building part B for Product 1");
    }
    @Override
    public Product1 getResult() {
        return new Product1();
    }
}
