package com.lvl3tasks.tsk24;

import java.util.HashMap;

public class Solution {
    public static final void printDiffNum(int a, int b, int c){
        HashMap<Integer, Integer> map = new HashMap<>(){{
                put(a, (get(a) == null) ? 1 : get(a) + 1);
                put(b, (get(b) == null) ? 1 : get(b) + 1);
                put(c, (get(c) == null) ? 1 : get(c) + 1);
            }};
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1)
                System.out.print(key);
        }
    }
}
