package com.lvl8tasks.tsk5;

class Solution {
    static int m1(){
        return m2();
    }
    static int m2(){
        return m3();
    }
    static int m3(){
        return m4();
    }
    static int m4(){
        return m5();
    }
    static int m5(){
        return m6();
    }
    static int m6(){
        return m7();
    }
    static int m7(){
        return m8();
    }
    static int m8(){
        return m9();
    }
    static int m9(){
        return Thread.currentThread().getStackTrace().length;
    }
}
