package JavaRush.lvl8tasks.tsk23;

import java.util.LinkedList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        printVowNCons(cons.nextLine());
    }
    static void printVowNCons(String str){
        str = str.replaceAll("\\s","");
        String arrWVow = "уеыаоэяию";
        LinkedList<String> arr1 = new LinkedList<>();
        LinkedList<String> arr2 = new LinkedList<>();
        for (int i = 0; i < str.length(); i++){
            if (arrWVow.contains(str.substring(i, i + 1))){
                arr1.add(str.substring(i, i + 1));
            } else {
                arr2.add(str.substring(i, i + 1));
            }
        }
        for (String now : arr1){
            System.out.print(now + " ");
        }
        System.out.println();
        for (String now : arr2){
            System.out.print(now + " ");
        }
    }
}
