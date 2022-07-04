package com.lvl7task.tsk1;

import java.util.HashSet;
import java.util.Iterator;

class Solution {
    static void check(HashSet<String> set){
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
