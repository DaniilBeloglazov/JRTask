package com.lvl4tasks.tsk7;

import java.util.Scanner;
import java.util.Vector;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();
        int num = console.nextInt();
        do{
            vector.add(num);
            num = console.nextInt();
        } while (num != -1);
        printAverage(vector);
    }
    static void printAverage(Vector<Integer> vec){
        double sum = 0;
        for (int i = 0; i < vec.size(); i++){
            sum += vec.get(i);
        }
        System.out.print(sum / vec.size());
    }
}
