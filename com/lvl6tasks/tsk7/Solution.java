package com.lvl6tasks.tsk7;

import java.util.ArrayList;

class Solution {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>(){{
           add("HI");
           add("Hola");
           add("1");
           add("2");
           add("3");
        }};
        System.out.println("Size: " + arr.size());
        for (var now : arr){
            System.out.println(now);
        }
    }
}
