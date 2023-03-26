package service;

public interface Component {
    void operation();
    boolean isComposite();
    void add(Component component);
    void remove(Component component);
    Component getChild(int n);
}
