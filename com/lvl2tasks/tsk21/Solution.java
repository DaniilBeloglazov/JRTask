package com.lvl2tasks.tsk21;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        printSal(n);
    }
    public static void printSal( int n){
        System.out.print("Я буду зарабатывать $" + n + " в час");
    }
}
