package service;

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
        private static volatile ExtensibleSingleton INSTANCE;
        private static synchronized ExtensibleSingleton register(Extension extension) {
            ExtensibleSingleton result = INSTANCE;
            if (result == null)
                INSTANCE = result = extension.extensibleSingleton;
            return result;
        }
        private static ExtensibleSingleton getInstance() {
            ExtensibleSingleton result = INSTANCE;
            if (result == null)
                result = register(Extension.DEFAULT);
            return result;
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
