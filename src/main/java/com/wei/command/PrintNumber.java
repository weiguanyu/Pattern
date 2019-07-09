package com.wei.command;

/**
 * @author 韦官余
 * @date 2019/4/16
 */
public class PrintNumber {
    int n;

    PrintNumber(int n) {
        this.n = n;
    }

    public void printEventNumber() {
        for (int m = 1; m <= n; m++) {
            System.out.print(" " + m);
        }
        System.out.println("");
    }

}
