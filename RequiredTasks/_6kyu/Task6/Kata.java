package RequiredTasks._6kyu.Task6;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++){
            if (Arrays.binarySearch(b,a[i]) < 0){
                arr.add(a[i]);
            }
        }
        int[] arrRT = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++){
            arrRT[i] = arr.get(i);
        }
        return arrRT;
    }
}