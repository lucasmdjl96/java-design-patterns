import service.ConcreteHandler1;
import service.ConcreteHandler2;
import service.Handler;
import service.Request;

public class Client {
    public static void main(String[] args) {
        Request request = new Request() {};
        Handler handler = new ConcreteHandler1();
        handler.successor(new ConcreteHandler2())
                .successor(new ConcreteHandler2())
                .successor(new ConcreteHandler1());
        handler.handle(request);
    }
}
