import service.State;
import service.Context;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(State.A);
        context.handle();
        context.handle();
        context.handle();
    }
}
