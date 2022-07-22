package JavaRush.lvl6tasks.tsk4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {
    public static void main (String[] args){
        Scanner cons = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            arr.add(cons.nextInt());
        }
        Collections.reverse(arr);
        for (var now : arr){
            System.out.println(now);
        }
    }
}
