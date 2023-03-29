import service.Aggregate;
import service.ConcreteAggregate;
import service.Iterator;

public class Client {
    public static void main(String[] args) {
        Aggregate<String> aggregate = new ConcreteAggregate<>("Hello", "World");
        Iterator<String> iterator = aggregate.createIterator();
        for (iterator.first(); !iterator.isDone(); iterator.next()) {
            System.out.println(iterator.currentItem());
        }
    }
}
