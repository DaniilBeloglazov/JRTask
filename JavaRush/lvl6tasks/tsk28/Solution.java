package JavaRush.lvl6tasks.tsk28;

import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    static void printInDecrease(ArrayList<Integer> arr){
        arr.sort(Comparator.reverseOrder());
        for (var now : arr){
            System.out.println(now);
        }
    }
}
