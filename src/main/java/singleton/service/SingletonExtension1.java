package singleton.service;

enum SingletonExtension1 implements ExtensibleSingleton {
    INSTANCE;
    @Override
    public void printName() {
        System.out.println("Singleton Extension 1");
    }
}
