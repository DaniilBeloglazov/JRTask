package JavaRush.lvl7task.tsk6;

import java.util.HashMap;

class Solution {
    static void printObj(HashMap<String, Object> map){
        for (String key : map.keySet()){
            if (map.get(key).getClass() == int[].class){
                for (int now : (int[]) map.get(key)){
                    System.out.print(now + " ");
                }
                System.out.println();
            } else
            System.out.println(map.get(key));
        }
    }
}
