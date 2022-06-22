package com.lvl2tasks.tsk7;

public class Solution {
    public static void main(String[] args){
        System.out.print(multiply10());
    }
    public static int multiply10(){
        int out = 1;
        for (int i = 1; i <= 10; i++){
            out *= i;
        }
        return out;
    }
}
