package service;

import java.util.ArrayList;
import java.util.List;

public class NonterminalExpression2 implements Expression {
    private final List<Expression> expressions = new ArrayList<>();
    @Override
    public void interpret(Context context) {
        for (Expression expression : expressions)
            expression.interpret(context);
    }
    public NonterminalExpression2 addExpression(Expression expression) {
        expressions.add(expression);
        return this;
    }
}
