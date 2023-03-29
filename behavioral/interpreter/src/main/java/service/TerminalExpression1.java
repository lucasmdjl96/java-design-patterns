package service;

public class TerminalExpression1 implements Expression {
    @Override
    public void interpret(Context context) {
        System.out.println("TE 1");
    }
}
