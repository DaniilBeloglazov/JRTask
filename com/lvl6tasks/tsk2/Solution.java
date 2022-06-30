package com.lvl6tasks.tsk2;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] str = new String[10];
        for (int i = 0; i < 10; i++){
            String inp = console.nextLine();
            str[i] = inp;
        }
        printReverse(str);
    }
    static void printReverse(String[] str){
        for (int  i = 9; i >= 0; i--){
            System.out.println(str[i]);
        }
    }
}
