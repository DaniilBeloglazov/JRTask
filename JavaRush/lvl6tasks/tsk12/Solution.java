package JavaRush.lvl6tasks.tsk12;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            arr.add(cons.nextLine());
        }
        printMaxOrMin(arr);
    }
    static void printMaxOrMin(ArrayList<String> arr){
        int minL = Integer.MAX_VALUE;
        int minLInd = 0;
        int maxL = 0;
        int maxLInd = 0;
        for (var now : arr){
            if (now.length() < minL){
                minL = now.length();
                minLInd = arr.indexOf(now);
            }
            if (now.length() > maxL){
                maxL = now.length();
                maxLInd = arr.indexOf(now);
            }
        }
        if (maxLInd > minLInd)
            System.out.print(arr.get(minLInd));
        else
            System.out.print(arr.get(maxLInd));
    }
}
