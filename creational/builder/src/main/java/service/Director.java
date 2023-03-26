package service;

import org.jetbrains.annotations.NotNull;

public class Director {
    public void construct(@NotNull Builder<?> builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
