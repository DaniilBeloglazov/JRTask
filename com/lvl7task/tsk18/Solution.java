package com.lvl7task.tsk18;

import java.util.Iterator;
import java.util.Map;

class Solution {
    static void deleteLowerThn500(Map<String, Integer> map){
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()){
            if(it.next() < 500){
                it.remove();
            }
        }
        for (var now : map.keySet()){
            System.out.println(now + " " + map.get(now));
        }
    }
}
