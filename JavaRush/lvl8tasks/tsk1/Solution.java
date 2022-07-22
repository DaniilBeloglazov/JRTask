package JavaRush.lvl8tasks.tsk1;

class Solution {
    public static void main(String[] args){
        for (var now : method1()){
            System.out.println(now);
        }
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        return method3();
    }

    public static StackTraceElement[] method3() {
        return method4();
    }

    public static StackTraceElement[] method4() {
        return method5();
    }

    public static StackTraceElement[] method5() {
        return Thread.currentThread().getStackTrace();
    }
}
