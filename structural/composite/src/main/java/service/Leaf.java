package service;

public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Leaf");
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }
    @Override
    public Component getChild(int n) {
        throw new UnsupportedOperationException();
    }
}
