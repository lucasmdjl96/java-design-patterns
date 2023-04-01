import service.ConcreteStrategyA;
import service.ConcreteStrategyB;
import service.Context;

public class Client {
    public static void main(String[] args) {
        Context context1 = new Context(ConcreteStrategyA.INSTANCE);
        context1.compute();
        System.out.println(context1.getResult());

        Context context2 = new Context(ConcreteStrategyB.INSTANCE);
        context2.compute();
        System.out.println(context2.getResult());

        Context context3 = new Context(context -> context.setResult("Client Strategy"));
        context3.compute();
        System.out.println(context3.getResult());
    }
}
