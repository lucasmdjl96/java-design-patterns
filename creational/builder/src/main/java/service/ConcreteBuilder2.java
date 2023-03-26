package service;

public class ConcreteBuilder2 implements Builder<Product2> {
    @Override
    public void buildPartA() {
        System.out.println("Building part A for Product 2");
    }
    @Override
    public void buildPartB() {
        System.out.println("Building part B for Product 2");
    }
    @Override
    public Product2 getResult() {
        return new Product2();
    }
}
