package com.lvl3tasks.tsk20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args){
        printInDecrease(1,2,3);
    }
    public static final void printInDecrease(int a, int b, int c){
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(a);
            add(b);
            add(c);
        }};
        Collections.sort(arr, Collections.reverseOrder());
        for (var now : arr){
            System.out.print(now + " ");
        }
    }
}
