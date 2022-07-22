package JavaRush.lvl9tasks.tsk15;

import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arr = new ArrayList[]{
            new ArrayList<>() {{
                add("1");
                add("5");
                add("6");
            }},
            new ArrayList<>() {{
                add("3");
                add("4");
                add("8");
            }},
            new ArrayList<>() {{
                add("6");
                add("5");
                add("3");
            }}
        };
        printCasList(arr);
    }
    static void printCasList(ArrayList<String>[] arr){
        for (var now : arr){
            for (String s : now){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
