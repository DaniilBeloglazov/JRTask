package com.lvl2tasks.tsk7;

public class Solution {
    public static void main(String[] args){
        multiply10();
    }
    public static void multiply10(){
        int out = 1;
        for (int i = 1; i <= 10; i++){
            out *= i;
        }
        System.out.print(out);
    }
}
