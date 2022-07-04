package com.lvl7task.tsk21;

import java.util.Map;

public class Solution {
    static void printMap(Map<String, String> map){
        for (var key : map.keySet()){
            System.out.println(key + " - " + map.get(key));
        }
    }
}
