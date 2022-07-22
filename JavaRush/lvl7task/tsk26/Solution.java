package JavaRush.lvl7task.tsk26;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main (String[] args){
        Scanner cons = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++){
            arr[i] = cons.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
    }
}
