package com.lvl6tasks.tsk14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        for (int i =0; i < 5; i++){
            arr.add(cons.nextLine());
        }
        delete3NReversePrint(arr);
    }
    static void delete3NReversePrint(ArrayList<String> arr){
        arr.remove(2);
        Collections.reverse(arr);
        for (var now : arr){
            System.out.println(now);
        }
    }
}
