package main.designModel.command;

/**
 * @author 韦官余
 * @date 2019/4/16
 */
public class RequestMaker {
    Command command;
    public void setCommand(Command command){
        this.command=command;
    }
    public void startExecute(){
        command.execute();
    }
}
