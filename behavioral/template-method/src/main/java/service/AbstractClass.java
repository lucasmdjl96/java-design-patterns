package service;

public abstract class AbstractClass {
    public final void templateMethod() {
        primitiveOperation1();
        hookOperation();
        primitiveOperation2();
    }

    protected abstract void primitiveOperation1();
    protected abstract void primitiveOperation2();
    protected void hookOperation() {}
}
