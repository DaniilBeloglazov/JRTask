package JavaRush.lvl6tasks.tsk1;

import java.util.Arrays;

class Solution {
    static int[] arr;
    static void initializeArray(){
        arr = new int[20];
    }
    static void printMax(int[] array){
        Arrays.sort(array);
        int it = array.length - 1;
        System.out.print(array[it]);
    }
}
