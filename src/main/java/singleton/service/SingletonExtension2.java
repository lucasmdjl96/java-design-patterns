package singleton.service;

public class SingletonExtension2 extends ExtensibleSingleton {
    SingletonExtension2() {}
    @Override
    public void printName() {
        System.out.println("Singleton Extension 2");
    }
}
