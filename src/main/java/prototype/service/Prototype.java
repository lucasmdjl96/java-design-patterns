package prototype.service;

import org.jetbrains.annotations.NotNull;

public interface Prototype<T> {
    T deepCopy();
    default T deepCopy(@NotNull Initializer<T> initializer) {
        T t = deepCopy();
        initializer.initialize(t);
        return t;
    }
}
