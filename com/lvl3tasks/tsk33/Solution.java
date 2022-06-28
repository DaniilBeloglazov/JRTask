package com.lvl3tasks.tsk33;

public class Solution {
    public static void printSSquare(){
        String s = "S";
        int num = 10;
        s = s.repeat(10);
        while (num != 0) {
            System.out.println(s);
            num--;
        }
    }
}
