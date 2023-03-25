package singleton;

import singleton.service.ExtensibleSingleton;
import static singleton.service.ExtensibleSingleton.Extension.*;
import singleton.service.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;

        ExtensibleSingleton.register(EXTENSION_1);
        ExtensibleSingleton.register(EXTENSION_2);
        ExtensibleSingleton.getInstance().printName();
    }
}
