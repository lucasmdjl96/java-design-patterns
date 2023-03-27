import service.Facade;
import service.Subsystem1;
import service.Subsystem2;

public class Client {
    public static void main(String[] args) {
        Facade facade = Facade.INSTANCE;
        facade.operation();

        Subsystem1 subsystem1 = new Subsystem1();
        subsystem1.suboperation1();

        Subsystem2 subsystem2 = new Subsystem2();
        subsystem2.suboperation2();
    }
}
