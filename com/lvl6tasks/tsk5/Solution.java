package com.lvl6tasks.tsk5;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        int[] arr20 = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int i = 0; i < 20; i++){
            arr20[i] = cons.nextInt();
        }
        arr1 = Arrays.copyOf(arr20,10);
        arr2 = Arrays.copyOfRange(arr20, arr20.length / 2, arr20.length);
        for (var now : arr1){
            System.out.println(now);
        }
    }
}
