package com.lvl6tasks.tsk21;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    static void printMinNMax(ArrayList<Integer> arr){
        Collections.sort(arr);
        System.out.println(arr.get(0));
        System.out.print(arr.get(arr.size() - 1));
    }
}
