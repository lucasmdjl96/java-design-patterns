import service.ConcreteObserver;
import service.ConcreteSubject;
import service.GeneralObserver;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver();
        subject.attach(observer);

        subject.setState("Hello");
        subject.setState("World");

        subject.detach(observer);
        subject.attach(new GeneralObserver());

        subject.setState("Hi");
    }
}
