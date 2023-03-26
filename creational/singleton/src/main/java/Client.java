import service.ExtensibleSingleton;
import static service.ExtensibleSingleton.Extension.*;
import service.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;

        ExtensibleSingleton.register(EXTENSION_1);
        ExtensibleSingleton.register(EXTENSION_2);
        ExtensibleSingleton.getInstance().printName();
    }
}
