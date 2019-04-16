package main.designModel.command;

/**
 * @author 韦官余
 * @date 2019/4/16
 */
public class PrintEnglishCommand implements Command {
    PrintLetter letter;

    public PrintEnglishCommand(PrintLetter letter) {
        this.letter = letter;
    }

    @Override
    public void execute() {
        letter.printEnglish();
    }
}
