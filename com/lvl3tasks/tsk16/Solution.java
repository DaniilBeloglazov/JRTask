package com.lvl3tasks.tsk16;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int time = console.nextInt();
        printColTrafLight(time);
    }
    public static void printColTrafLight(int time){
        time %= 5;
        if (time < 3){
            System.out.print("зеленый");
        } else if (time == 3) {
            System.out.print("желтый");
        } else
            System.out.print("красный");
    }
}
