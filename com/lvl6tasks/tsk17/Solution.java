package com.lvl6tasks.tsk17;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            arr.add(cons.nextLine());
        }
        doubleValues(arr);
    }
    static void doubleValues(ArrayList<String> str){
        for (int i = 0; i < str.size(); i+=2){
            str.add(i, str.get(i));
        }
        for (String now : str){
            System.out.println(now);
        }
    }
}
