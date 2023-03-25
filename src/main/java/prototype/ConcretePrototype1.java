package prototype;

import prototype.service.Prototype;

public class ConcretePrototype1 implements Product1, Prototype<Product1> {
    private int data;
    public ConcretePrototype1(int data) {
        this.data = data;
    }
    @Override
    public int getData() {
        return data;
    }
    @Override
    public void setData(int data) {
        this.data = data;
    }
    @Override
    public Product1 deepCopy() {
        return new ConcretePrototype1(data);
    }
}
