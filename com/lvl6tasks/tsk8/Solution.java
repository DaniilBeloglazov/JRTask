package com.lvl6tasks.tsk8;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>(){{
            add(cons.nextLine());
            add(cons.nextLine());
            add(cons.nextLine());
            add(cons.nextLine());
            add(cons.nextLine());
        }};
        maxLengthInArr(arr);
    }
    static void maxLengthInArr(ArrayList<String> arr){
        int maxLen = 0;
        ArrayList<String> answer = new ArrayList<>();
        for (var now : arr){
            if (now.length() > maxLen) {
                answer.clear();
                maxLen = now.length();
            }
            if (now.length() == maxLen){
                answer.add(now);
            }
        }
        for (var now : answer){
            System.out.println(now);
        }
    }
}
