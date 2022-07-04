package com.lvl7task.tsk16;

import java.util.*;

class Solution {
    static void deleteWhosSumm(HashMap<String, Date> map){
        Iterator<Map.Entry<String,Date>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String,Date> entry = it.next();
            if (entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8) {
                it.remove();
            }
        }
        Iterator <String> it1 = map.keySet().iterator();
        while(it1.hasNext()){
            String key = it1.next();
            System.out.println(key + " " + map.get(key));
        }
    }
}
