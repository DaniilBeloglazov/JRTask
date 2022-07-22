package JavaRush.lvl6tasks.tsk15;

import java.util.ArrayList;

class Solution {
    public static void main (String[] args){
        ArrayList<String> arr = new ArrayList<>(){{
            add("Мама");
            add("Мыла");
            add("Раму");
        }};
        addImenNprint(arr);
    }
    static void addImenNprint(ArrayList<String> arr){
        for (int i = 0; i < 3; i+=2){
            arr.add(i + 1, "именно");
        }
        for (var now : arr){
            System.out.println(now);
        }
    }
}
