package main.designModel.command;

/**
 * @author 韦官余
 * @date 2019/4/16
 */
public class PrintRussianCommand implements Command {
    PrintLetter letter;

    public PrintRussianCommand(PrintLetter letter) {
        this.letter = letter;
    }

    @Override
    public void execute() {
        letter.printRussian();
    }
}
