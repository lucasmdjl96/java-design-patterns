package singleton.service;

public class SingletonExtension1 extends ExtensibleSingleton {
    SingletonExtension1() {}
    @Override
    public void printName() {
        System.out.println("Singleton Extension 1");
    }
}
