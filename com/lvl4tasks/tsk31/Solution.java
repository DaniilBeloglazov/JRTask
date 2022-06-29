package com.lvl4tasks.tsk31;

import java.util.HashSet;
import java.util.Iterator;

class Solution {
    static void printMinOf5(int a, int b, int c, int d, int e){
        HashSet<Integer> set = new HashSet<>(){{
            add(a);
            add(b);
            add(c);
            add(d);
            add(e);
        }};
        Iterator<Integer> it = set.iterator();
        System.out.print(it.next());
    }
}
