package com.lvl9tasks.tsk6;

class Solution {
    public static void main(String[] args){
        short b = (short) 45;
        char c = (short)'c';
        short s = (short)1005.22;
        int i = 150000;
        float f = 4.10f;
        double d = 1.256d;
        double result = (f * b) + (i / c) - (d * s) + 562.78d; // (4 * 45) + (32767 / 63) - (1 * 1005)
        System.out.print(result);
    }
}
