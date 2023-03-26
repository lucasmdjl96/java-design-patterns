import service.Prototype;

public class ConcretePrototype2 implements Product2, Prototype<Product2> {
    private String data;
    public ConcretePrototype2(String data) {
        this.data = data;
    }
    @Override
    public String getData() {
        return data;
    }
    @Override
    public void setData(String data) {
        this.data = data;
    }
    @Override
    public Product2 deepCopy() {
        return new ConcretePrototype2(data);
    }
}
