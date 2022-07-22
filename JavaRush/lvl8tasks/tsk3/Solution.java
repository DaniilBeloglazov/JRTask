package JavaRush.lvl8tasks.tsk3;

class Solution {
    static void main(String[] args){
        method1();
    }

    static int method1() {
        method2();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    static int method2() {
        method3();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    static int method3() {
        method4();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    static int method4() {
        method5();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    static int method5() {
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
