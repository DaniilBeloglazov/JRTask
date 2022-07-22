package JavaRush.lvl6tasks.tsk13;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            arr.add(cons.nextInt());
        }
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>();
        ArrayList<Integer> arr3= new ArrayList<>();
        sortIn3Arr(arr, arr1, arr2, arr3);
        printList(arr1);
        System.out.println();
        printList(arr2);
        System.out.println();
        printList(arr3);
    }
    static void sortIn3Arr(ArrayList<Integer> mainArr, ArrayList<Integer> arr3,ArrayList<Integer> arr2,ArrayList<Integer> arrOth){
        for (var now : mainArr){
            if (now % 3 == 0)
                arr3.add(now);
            if (now % 2 == 0)
                arr2.add(now);
            if (now % 2 != 0 && now % 3 != 0){
                arrOth.add(now);
            }
        }
    }
    static void printList(ArrayList<Integer> arr){
        for (var now : arr){
            System.out.println(now);
        }
    }
}
