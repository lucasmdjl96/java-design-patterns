package singleton.service;

final class SingletonExtension2 implements ExtensibleSingleton {
    final static SingletonExtension2 INSTANCE = new SingletonExtension2();
    private SingletonExtension2() {}
    @Override
    public void printName() {
        System.out.println("Singleton Extension 2");
    }
}
