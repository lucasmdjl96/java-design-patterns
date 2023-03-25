package singleton.service;

public class ExtensibleSingleton {
    private volatile static ExtensibleSingleton INSTANCE;

    public static synchronized void register(Extension extension) {
        if (INSTANCE == null)
            INSTANCE = extension.extensibleSingleton;
    }
    public static ExtensibleSingleton getInstance() {
        if (INSTANCE == null)
            register(Extension.BASE);
        return INSTANCE;
    }

    public void printName() {
        System.out.println("Extensible Singleton");
    }
    protected ExtensibleSingleton() {}
    public enum Extension {
        BASE(new ExtensibleSingleton()),
        EXTENSION_1(new SingletonExtension1()),
        EXTENSION_2(new SingletonExtension2());
        final ExtensibleSingleton extensibleSingleton;
        Extension(ExtensibleSingleton extensibleSingleton) {
            this.extensibleSingleton = extensibleSingleton;
        }
    }
}
