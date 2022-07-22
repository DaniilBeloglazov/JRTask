package JavaRush.lvl6tasks.tsk20;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int n = cons.nextInt();
        int m = cons.nextInt();
        cons.nextLine();
        for (int i = 0; i < n; i++){
            arr.add(cons.nextLine());
        }
        printSwapMStringsToEnd(arr, m);
    }
    static void printSwapMStringsToEnd(ArrayList<String> arr, int m){
        for (int i = 0; i < m; i++){
            arr.add(arr.size() - 1, arr.remove(0));
        }
        for (String now : arr){
            System.out.println(now);
        }
    }
}
