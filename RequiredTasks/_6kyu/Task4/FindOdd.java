package RequiredTasks._6kyu.Task4;

import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a) {
        Arrays.sort(a);
        int count = 0;
        int curNum = a[0];
        for (int num : a){
            if (num == curNum){
                count++;
            } else {
                if (count % 2 != 0)
                    break;
                curNum = num;
                count = 1;
            }
        }
        return curNum;
    }
}