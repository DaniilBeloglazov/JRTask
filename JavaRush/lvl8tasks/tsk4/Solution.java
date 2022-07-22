package JavaRush.lvl8tasks.tsk4;

class Solution {
    static StackTraceElement[] m1(){
        return m2();
    }
    static StackTraceElement[] m2(){
        return m3();
    }
    static StackTraceElement[] m3(){
        return m4();
    }
    static StackTraceElement[] m4(){
        return m5();
    }
    static StackTraceElement[] m5(){
        return m6();
    }
    static StackTraceElement[] m6(){
        return m7();
    }
    static StackTraceElement[] m7(){
        return m8();
    }
    static StackTraceElement[] m8(){
        return m9();
    }
    static StackTraceElement[] m9(){
        return Thread.currentThread().getStackTrace();
    }
}
