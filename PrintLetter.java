package main.designModel.command;

import javax.sound.midi.Soundbank;
import java.util.zip.ZipEntry;

/**
 * @author 韦官余
 * @date 2019/4/16
 */
public class PrintLetter {
    public void printEnglish(){
        for(char c = 'a';c<= 'z';c++){
            System.out.print(" "+c);
        }
        System.out.println("");
    }
    public void printRussian(){
        for(char c = 'α';c<= 'γ';c++){
            System.out.print(" "+c);
        }
        System.out.println("");
    }

}
