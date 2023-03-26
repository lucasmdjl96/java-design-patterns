import service.Component;
import service.Composite;
import service.Leaf;

public class Client {
    public static void main(String[] args) {
        Component component = new Composite();

        component.add(new Leaf());
        component.add(new Leaf());

        Component child1 = new Composite();
        child1.add(new Leaf());
        child1.add(new Leaf());
        child1.add(new Leaf());
        component.add(child1);

        component.add(new Leaf());

        component.operation();
    }
}
