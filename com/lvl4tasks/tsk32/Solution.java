package com.lvl4tasks.tsk32;

import java.util.Scanner;
import java.util.TreeSet;

class Solution {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int n = console.nextInt();
        for (int i = 0; i < n; i++){
            int num = console.nextInt();
            set.add(num);
        }
        printMaxOfSet(set);
    }
    static void printMaxOfSet(TreeSet<Integer> set){
        System.out.print(set.last());
    }
}
