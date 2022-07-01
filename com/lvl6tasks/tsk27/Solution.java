package com.lvl6tasks.tsk27;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        String inp = cons.nextLine();
        while (!inp.isEmpty()){
            arr.add(inp);
            inp = cons.nextLine();
        }
        printConverted(arr);
    }
    static void printConverted(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i).length() % 2 == 0)
                arr.set(i, arr.get(i) + " " + arr.get(i));
            else
                arr.set(i, arr.get(i) + " " + arr.get(i)+ " " + arr.get(i));
        }
        for (String now : arr){
            System.out.println(now);
        }
    }
}
