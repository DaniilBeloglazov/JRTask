package com.lvl6tasks.tsk11;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            arr.add(cons.nextLine());
        }
        swap1stNLast13Times(arr);
    }
    static void swap1stNLast13Times(ArrayList<String> arr){
        for (int i = 0 ; i < 13; i++){
            arr.add(0, arr.get(arr.size() - 1));
            arr.remove(arr.size() - 1);
        }
        for (var now : arr){
            System.out.println(now);
        }
    }
}
