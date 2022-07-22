package JavaRush.lvl7task.tsk22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        int n  = cons.nextInt();
        ArrayList<Integer> arr = getIntegerList(n);
        System.out.print(getMinimum(arr));
    }
    static ArrayList<Integer> getIntegerList(int n){
        Scanner cons = new Scanner(System.in);
        ArrayList<Integer> out = new ArrayList<>();
        for (int i = 0; i < n; i++){
            out.add(cons.nextInt());
        }
        return out;
    }
    static int getMinimum(ArrayList<Integer> arr){
        return Collections.min(arr);
    }
}
