import service.*;

public class Client {
    public static void main(String[] args) {
        Context context = new Context() {};
        Expression abstractSyntaxTree =
                new NonterminalExpression1()
                        .expression1(new TerminalExpression1())
                        .expression2(
                                new NonterminalExpression2()
                                        .addExpression(new TerminalExpression1())
                                        .addExpression(new TerminalExpression2())
                                        .addExpression(
                                                new NonterminalExpression2()
                                                        .addExpression(new TerminalExpression1())
                                        )
                        );
        abstractSyntaxTree.interpret(context);
    }
}
