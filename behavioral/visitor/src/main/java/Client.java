import service.*;

public class Client {
    public static void main(String[] args) {
        Element objectStructure =
                new CompositeElement()
                        .add(new CompositeElement()
                                .add(new ConcreteElementA(2))
                                .add(new CompositeElement()
                                        .add(new ConcreteElementB(2))
                                        .add(new ConcreteElementB(1))
                                ).add(new ConcreteElementB(2))
                        ).add(new ConcreteElementA(5));

        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
        objectStructure.accept(visitor1);
        System.out.println(visitor1.getCount());

        ConcreteVisitor2 visitor2 = new ConcreteVisitor2();
        objectStructure.accept(visitor2);
        System.out.println(visitor2.getCount());
    }
}
