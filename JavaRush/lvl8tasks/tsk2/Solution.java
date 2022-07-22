package JavaRush.lvl8tasks.tsk2;

class Solution {
    public static void main(String[] args) throws Exception {
        System.out.print (method2());
    }

    static String method1() {
        method2();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    static String method2() {
        method3();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    static String method3() {
        method4();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    static String method4() {
        method5();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    static String method5() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }
}
