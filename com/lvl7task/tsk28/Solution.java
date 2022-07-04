package com.lvl7task.tsk28;

import java.time.Month;

class Solution {
    static void whichMonth(int num){
        String name = Month.of(num).toString();
        name = name.substring(0,1) + name.substring(1).toLowerCase();
        System.out.print(name + " is " + num + " month");
    }
}
