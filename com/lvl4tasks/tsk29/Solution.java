package com.lvl4tasks.tsk29;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

class Solution {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        while(!console.hasNext("сумма")){
            String in;
            in = console.nextLine();
            arr.add(parseInt(in));
        }
        printSumOfArr(arr);
    }
    static void printSumOfArr(ArrayList<Integer> arr){
        int sum = 0;
        for (Integer now : arr){
            sum += now;
        }
        System.out.print(sum);
    }
}
