package service;

public enum Facade {
    INSTANCE;
    private final Subsystem1 subsystem1 = new Subsystem1();
    private final Subsystem2 subsystem2 = new Subsystem2();
    public void operation() {
        subsystem1.suboperation1();
        subsystem2.suboperation2();
    }
}
