package com.lvl2tasks.tsk16;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        console.nextLine();
        String name = console.nextLine();
        inPS(num, name);
    }
    public static void inPS(int num, String name){
        System.out.print(name + " захватит мир через " + num + " лет. Му-ха-ха!");
    }
}
