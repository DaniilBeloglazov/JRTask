package com.lvl7task.tsk14;

import java.util.HashSet;
import java.util.Iterator;

class Solution {
    static void deleteGreaterTh10(HashSet<Integer> set){
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if (it.next() > 10) {
                it.remove();
            }
        }
    }
}
