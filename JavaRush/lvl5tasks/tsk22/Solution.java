package JavaRush.lvl5tasks.tsk22;

import java.util.*;

public class Solution {
    static void printInIncrease5(int a, int b, int c, int d, int e){
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(a);
            add(b);
            add(c);
            add(d);
            add(e);
        }};
        Collections.sort(arr);
        for (var now : arr){
            System.out.print(now + " ");
        }
    }
}
