package prototype.service;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    private PrototypeManager() {}
    private static final Map<Class<?>, Prototype<?>> registry = new HashMap<>();
    public static <T> void register(Class<T> cls, Prototype<T> prototype) {
        registry.put(cls, prototype);
    }
    public static <T> T getProduct(Class<T> cls) {
        Prototype<T> prototype = get(cls);
        return prototype.deepCopy();
    }
    public static <T> T getProduct(Class<T> cls, @NotNull Initializer<T> initializer) {
        Prototype<T> prototype = get(cls);
        return prototype.deepCopy(initializer);
    }
    private static <T> Prototype<T> get(Class<T> cls) {
        // This cast succeeds because elements must have been put in the registry using the register method
        @SuppressWarnings("unchecked") Prototype<T> prototype = (Prototype<T>) registry.get(cls);
        return prototype;
    }
}
