import service.*;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        invoker.setCommand(command);

        invoker.executeCommand();


        Invoker invoker1 = new Invoker();
        Command command1 = new ConcreteGenericCommand<>(receiver, Receiver::action);
        invoker1.setCommand(command1);

        invoker1.executeCommand();


        Invoker invoker2 = new Invoker();
        MacroCommand macroCommand = new MacroCommand();
        macroCommand.addCommand(
                new ConcreteGenericCommand<>(receiver, Receiver::action)
        ).addCommand(
                new ConcreteGenericCommand<>(receiver, Receiver::action)
        );
        invoker2.setCommand(macroCommand);

        invoker2.executeCommand();
    }
}
