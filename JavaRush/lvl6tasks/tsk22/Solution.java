package JavaRush.lvl6tasks.tsk22;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<>();
        Scanner cons = new Scanner(System.in);
        while (!cons.hasNext("end")){
            str.add(cons.nextLine());
        }
        printAllStr(str);
    }
    static void printAllStr(ArrayList<String> arr){
        for (var now : arr){
            System.out.println(now);
        }
    }
}
