package com.lvl3tasks.tsk34;

public class Solution {
    public static final void printMultiTable(){
        int num = 1;
        while(num <= 10){
            for (int i = 1; i <= 10; i++)
                System.out.print(num * i + " ");
            System.out.println();
            num++;
        }
    }
}
