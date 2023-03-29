package service;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {
    private final List<Command> commands = new ArrayList<>();
    public MacroCommand addCommand(Command command) {
        commands.add(command);
        return this;
    }
    @Override
    public void execute() {
        for (Command command : commands)
            command.execute();
    }
}
