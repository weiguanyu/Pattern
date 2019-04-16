package main.designModel.command;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

/**
 * @author 韦官余
 * @date 2019/4/16
 */
public class Application {
    public static void main(String[] args) {
        ArrayList<Command> list = new ArrayList<>();
        RequestMaker maker = new RequestMaker();//创建请求者
        Command command1 = new PrintEnglishCommand(new PrintLetter());//创建具体命令指定接收者
        Command command2 = new PrintRussianCommand(new PrintLetter());
        Command command3 = new PrintEvenNumberCommand(new PrintNumber(20));
        list.add(command1);
        list.add(command2);
        list.add(command3);
        Command macroCommand = new MacroCommand(list);
        System.out.println("单纯输出英文字母");
        maker.setCommand(command1);
        maker.startExecute();
        System.out.println("输出宏命令");
        maker.setCommand(macroCommand);
        maker.startExecute();
    }
}
