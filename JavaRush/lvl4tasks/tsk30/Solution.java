package JavaRush.lvl4tasks.tsk30;

import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        int num1 = cons.nextInt();
        int num2 = cons.nextInt();
        printSumOf2(num1, num2);
    }
    static void printSumOf2(int a, int b){
        System.out.print(a + b);
    }
}