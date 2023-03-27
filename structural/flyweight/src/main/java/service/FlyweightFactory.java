package service;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum FlyweightFactory {
    INSTANCE;
    private final Map<ConcreteShareableFlyweight.IntrinsicState, ConcreteShareableFlyweight> shareRegistry =
            new ConcurrentHashMap<>();
    // instantiation of flyweights may occur more than once if we don't synchronize this method
    // in which case we can use a normal HashMap
    public Flyweight getFlyweight(ConcreteShareableFlyweight.IntrinsicState intrinsicState) {
       return shareRegistry.computeIfAbsent(intrinsicState, ConcreteShareableFlyweight::new);
    }
    @Contract(value = "_ -> new", pure = true)
    public @NotNull UnshareableFlyweight getFlyWeight(ConcreteUnshareableFlyweight.AllState allState) {
        return new ConcreteUnshareableFlyweight(allState);
    }
}
