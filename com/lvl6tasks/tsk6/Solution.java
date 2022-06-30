package com.lvl6tasks.tsk6;

import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = cons.nextInt();
        }
        whereMoreCitizen(arr);
    }
    static void whereMoreCitizen(int[] arr){
        int citizenEven = 0, citizenOdd = 0;
        for (int i = 0; i < 15; i++){
            if (i % 2 == 0)
                citizenEven += arr[i];
            else
                citizenOdd += arr[i];
        }
        // В условии не предусмотрено что они могут быть равны
        if (citizenEven > citizenOdd)
            System.out.print("В домах с четными номерами проживает больше жителей.");
        else
            System.out.print("В домах с нечетными номерами проживает больше жителей.");
    }
}
