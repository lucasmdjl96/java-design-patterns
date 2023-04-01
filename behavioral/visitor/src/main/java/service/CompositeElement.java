package service;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CompositeElement implements Element {
    private final List<Element> children = new ArrayList<>();
    public CompositeElement add(Element element) {
        children.add(element);
        return this;
    }
    @Override
    public void accept(@NotNull Visitor visitor) {
        for (Element element : children)
            element.accept(visitor);
        visitor.visit(this);
    }
}
