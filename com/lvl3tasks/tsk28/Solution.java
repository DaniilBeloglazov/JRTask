package com.lvl3tasks.tsk28;

import java.util.Scanner;
import java.util.Vector;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int a = console.nextInt() ,b = console.nextInt(), c = console.nextInt();
        System.out.print(getCountOfPositive(a, b, c));
    }
    public static final int getCountOfPositive(int a, int b, int c){
        int count = 0;
        Vector<Integer> vec = new Vector<>(){{
            add(a);
            add(b);
            add(c);
        }};
        for (var now:vec){
           count = (now > 0) ? count + 1 : count;
        }
        return count;
    }
}
