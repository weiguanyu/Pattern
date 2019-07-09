package com.wei.command;

/**
 * @author 韦官余
 * @date 2019/4/16
 */
public class PrintEvenNumberCommand implements Command {
    PrintNumber number;

    public PrintEvenNumberCommand(PrintNumber number) {
        this.number = number;
    }

    @Override
    public void execute() {
     number.printEventNumber();
    }
}
