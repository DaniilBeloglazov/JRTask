package JavaRush.lvl9tasks.tsk16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 20; i++){
            String input = cons.nextLine();
            if (map.containsKey(input))
                map.put(input, map.get(input) + 1);
            else
                map.put(input, 1);
        }
        for (var key : map.keySet()){
            System.out.println( key + " " + map.get(key));
        }
    }


    static void printMap(Map<String, Integer> map, String[] str){
        for (int i = 0; i < 20; i++){
            String input = str[i];
            if (map.containsKey(input))
                map.put(input, map.get(input) + 1);
            else
                map.put(input, 1);
        }
        for (var key : map.keySet()){
            System.out.println( key + " " + map.get(key));
        }
    }
}
