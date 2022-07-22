package JavaRush.lvl3tasks.tsk41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static final void printMedOf3(Integer num1, Integer num2, Integer num3){
        int[] arr = new int[] {num1, num2, num3};
        Arrays.sort(arr);
        System.out.print(arr[1]);
    }
}
