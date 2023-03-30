package service;

public interface Colleague {
    Callback getMediatorCallback();
    default void changed() {
        getMediatorCallback().callback();
    }
}
