package com.lvl2tasks.tsk19;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String name1 = console.nextLine();
        String name2 = console.nextLine();
        String name3 = console.nextLine();
        outP(name1, name2, name3);
    }
    public static void outP(String name1, String name2, String name3){
        System.out.print(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}
