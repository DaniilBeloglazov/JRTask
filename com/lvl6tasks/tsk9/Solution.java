package com.lvl6tasks.tsk9;

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
        minLengthInArr(arr);
    }
    static void minLengthInArr(ArrayList<String> arr){
        int minLen = Integer.MAX_VALUE;
        ArrayList<String> answer = new ArrayList<>();
        for (var now : arr){
            if (now.length() < minLen) {
                answer.clear();
                minLen = now.length();
            }
            if (now.length() == minLen){
                answer.add(now);
            }
        }
        for (var now : answer){
            System.out.println(now);
        }
    }
}
