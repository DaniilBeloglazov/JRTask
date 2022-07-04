package com.lvl7task.tsk15;

import java.util.Collections;
import java.util.HashMap;

class Solution {
    static void getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int cnt = Collections.frequency(map.values(), name);
        System.out.println("Имя "+ name + " встречается " + cnt + "раз");
    }
}
