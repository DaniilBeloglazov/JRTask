package com.lvl8tasks.tsk26;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args){
        ArrayList<int[]> arr = new ArrayList<>(){{
            add(new int[]{1,2,3,4,5});
            add(new int[]{1,2});
            add(new int[]{1,2,3,4});
            add(new int[]{1,2,3,4,5,6,7});
            add(new int[]{});
        }};
        for (var now : arr){
            for (var num : now){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
