package service;

public class TerminalExpression2 implements Expression {
    @Override
    public void interpret(Context context) {
        System.out.println("TE 2");
    }
}
