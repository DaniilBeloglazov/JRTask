package JavaRush.lvl6tasks.tsk18;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            arr.add(cons.nextLine());
        }
        isSortedLength(arr);
    }
    static void isSortedLength(ArrayList<String> arr){
        int length = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() < length) {
                System.out.println(i);
            }
            length = arr.get(i).length();
        }
    }
}
