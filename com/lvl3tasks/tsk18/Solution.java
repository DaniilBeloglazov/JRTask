package com.lvl3tasks.tsk18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        printMin(a,b);
    }
    static final void printMin(int a, int b){
        HashSet<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        Iterator<Integer> it = set.iterator();
        System.out.print(it.next());
    }
}
