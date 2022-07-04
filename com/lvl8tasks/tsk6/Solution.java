package com.lvl8tasks.tsk6;

class Solution {
    static void log(String message){
        System.out.print(Thread.currentThread().getStackTrace()[2].getClassName() + ": " + Thread.currentThread().getStackTrace()[2].getMethodName() + ": " + message);
    }
}
