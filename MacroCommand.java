package main.designModel.command;

import java.util.ArrayList;

/**
 * @author 韦官余
 * @date 2019/4/16
 */
public class MacroCommand implements Command{
    ArrayList<Command> commands;

    public MacroCommand(ArrayList<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i <commands.size() ; i++) {
            Command command = commands.get(i);
            command.execute();
        }
    }
}
