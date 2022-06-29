package com.lvl5tasks.tsk6;

import java.util.Scanner;

class Solution {
    static int even = 0, odd = 0;
    public static void main (String[] args){
        Scanner cons = new Scanner(System.in);
        int num = cons.nextInt();

    }
    static void printHowMuchEvenNOdd(int num){
        while (num != 0){
            if (num % 10 % 2 == 0)
                even++;
            else
                odd++;
            num = num / 10;
        }
        System.out.print("Even: " + even + " Odd: " + odd);
    }
}
