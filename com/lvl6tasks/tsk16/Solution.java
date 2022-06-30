package com.lvl6tasks.tsk16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

class Solution {
    static void fix (ArrayList<String> arr){
        int i = 0;
        while (i < arr.size()) {
            String elem = arr.get(i);
            if (elem.contains("р") && elem.contains("л")){
                i++;
                continue;
            }
            else if (elem.contains("р")){
                arr.remove(i);
                continue;
            } else if (elem.contains("л")){
                arr.add(i, elem);
                i+=2;
            } else
                i++;
        }
        for (var now : arr){
            System.out.println(now);
        }
    }
}
