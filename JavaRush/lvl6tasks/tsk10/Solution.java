package JavaRush.lvl6tasks.tsk10;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main (String[] args){
        Scanner cons = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            arr.add(cons.nextLine());
        }
        printArrL(arr);
    }
    static void printArrL(ArrayList<String> arr){
        for (var now : arr){
            System.out.println(now);
        }
    }
}
