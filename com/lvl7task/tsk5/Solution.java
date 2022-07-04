package com.lvl7task.tsk5;

import java.util.HashMap;

class Solution {
    static void printValues(HashMap<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
