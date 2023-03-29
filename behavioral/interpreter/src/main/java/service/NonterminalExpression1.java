package service;

public class NonterminalExpression1 implements Expression {
    private Expression expression1;
    private Expression expression2;
    @Override
    public void interpret(Context context) {
        expression1.interpret(context);
        expression2.interpret(context);
    }
    public NonterminalExpression1 expression1(Expression expression) {
        this.expression1 = expression;
        return this;
    }
    public NonterminalExpression1 expression2(Expression expression) {
        this.expression2 = expression;
        return this;
    }
}
