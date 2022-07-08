package CodeWars.Task10;

import java.util.Arrays;

public class FindOutlier{
    static int find(int[] integers){
        int[] arrEven = Arrays.stream(integers).filter(i -> i % 2 == 0).toArray();
        int[] arrOdd = Arrays.stream(integers).filter(i -> i % 2 != 0).toArray();
        if (arrEven.length == 1)
            return arrEven[0];
        else {
            return arrOdd[0];
        }
    }
}
