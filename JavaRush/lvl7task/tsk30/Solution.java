package JavaRush.lvl7task.tsk30;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        String[] arr = new String[20];
        for (int i = 0; i < 20; i++){
            arr[i] = cons.nextLine();
        }
        printAlphaOrder(arr);
    }
    static void printAlphaOrder(String[] arr){
        Arrays.sort(arr);
        for (String str : arr){
            System.out.println(str);
        }
    }
}
