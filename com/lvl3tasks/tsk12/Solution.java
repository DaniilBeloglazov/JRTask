package com.lvl3tasks.tsk12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        changenPrint(num);
    }
    public static void changenPrint(int num) {
        if (num == 0)
            System.out.print(0);
        else if (num > 0) {
            num *= 2;
            System.out.print(num);
        } else {
            num++;
            System.out.print(num);
        }
    }
}
