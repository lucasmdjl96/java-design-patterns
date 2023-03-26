import service.Abstraction;
import service.RefinedAbstraction;

public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.chooseImplementor(Abstraction.ImplementorType.IMPLEMENTOR_B);
        abstraction.operation();
    }
}
