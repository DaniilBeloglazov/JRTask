package com.lvl7task.tsk2;

import java.util.HashMap;

class Solution {
    static void printT(HashMap<String, String> map){
        for (String name : map.keySet()){
            System.out.println(name + " - " + map.get(name));
        }
    }
}
