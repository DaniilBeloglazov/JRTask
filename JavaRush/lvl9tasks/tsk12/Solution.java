package JavaRush.lvl9tasks.tsk12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            String input = cons.nextLine();
            casual(input, map);
        }
        for (var key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
    static void casual(String str, HashMap<Character, Integer> map){
        char[] strNew = str.toLowerCase().toCharArray();
        for (int i = 0; i < strNew.length; i++){
            if (map.containsKey(strNew[i]))
                map.put(strNew[i], map.get(strNew[i]) + 1);
            else
                map.put(strNew[i], 1);
        }
    }
    static void casual(String[] str, HashMap<Character, Integer> map){
        for (String now : str) {
            char[] strNew = now.toLowerCase().toCharArray();
            for (int i = 0; i < strNew.length; i++) {
                if (map.containsKey(strNew[i]))
                    map.put(strNew[i], map.get(strNew[i]) + 1);
                else
                    map.put(strNew[i], 1);
            }
        }
    }
}
