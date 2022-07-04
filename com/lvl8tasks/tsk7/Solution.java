package com.lvl8tasks.tsk7;

class Solution {
    public static void exc() throws Exception{
        try{
            int a = 42 / 0;
        } catch (ArithmeticException e){
            System.out.print(e.getClass());
        }
    }
}
