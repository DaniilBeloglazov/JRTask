package com.lvl9tasks.tsk3;

class Solution {
    public static void main(String[] args){
        float f = (float)128.50;
        int i = (int)f;
        int b = (int)(byte)(i + f);
        System.out.print(b);
    }
}
