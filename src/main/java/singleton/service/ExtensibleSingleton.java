package singleton.service;

public sealed interface ExtensibleSingleton
        permits DefaultSingleton, SingletonExtension1, SingletonExtension2 {
    default void printName() {
        System.out.println("Extensible Singleton");
    }
    static ExtensibleSingleton getInstance() {
        return InstanceHolder.getInstance();
    }
    static void register(Extension extension) {
        InstanceHolder.register(extension);
    }
    final class InstanceHolder {
        private InstanceHolder() {}
        private static ExtensibleSingleton INSTANCE;
        private static synchronized void register(Extension extension) {
            if (INSTANCE == null)
                INSTANCE = extension.extensibleSingleton;
        }
        private static ExtensibleSingleton getInstance() {
            if (INSTANCE == null)
                register(Extension.DEFAULT);
            return INSTANCE;
        }
    }
    enum Extension {
        DEFAULT(DefaultSingleton.INSTANCE),
        EXTENSION_1(SingletonExtension1.INSTANCE),
        EXTENSION_2(SingletonExtension2.INSTANCE);
        final ExtensibleSingleton extensibleSingleton;
        Extension(ExtensibleSingleton extensibleSingleton) {
            this.extensibleSingleton = extensibleSingleton;
        }
    }
}
