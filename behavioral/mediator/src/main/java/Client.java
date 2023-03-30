import service.ConcreteMediator;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.getColleague1().perform();
    }
}
