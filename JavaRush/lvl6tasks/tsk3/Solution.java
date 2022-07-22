package JavaRush.lvl6tasks.tsk3;

import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        String[] str = new String[10];
        int[] arr = new int[10];
        Scanner cons = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            str[i] = cons.nextLine();
        }
        putLengthOfElements(str,arr);
        for (var now : arr){
            System.out.println(now);
        }
    }
    static void putLengthOfElements(String[] str, int[] arr){
        for (int i = 0; i < 10; i++){
            arr[i] = str[i].length();
        }
    }
}
