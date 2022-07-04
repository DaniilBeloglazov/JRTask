package com.lvl8tasks.tsk17;

class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());
    }

    static void processExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RuntimeException e) {
            printStack(e);
        }
    }

    static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    void method1() {
        throw new NullPointerException();
    }

    void method2() {
        throw new IndexOutOfBoundsException();
    }

    void method3() {
        throw new NumberFormatException();
    }
}
