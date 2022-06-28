package com.lvl3tasks.tsk27;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        System.out.print(getDigitInf(num));
    }
    public static final String getDigitInf(int n){
        String even = (n % 2 == 0) ? "четное" : "нечетное";
        String signs = (n / 100 != 0) ? "трехзначное" : (n / 10 != 0) ? "двузначное" : "однозначное";
        return (even + " " + signs + " число");
    }
}
