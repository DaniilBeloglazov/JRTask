package CodeWars.Task9;

import java.util.HashMap;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (var now : text.toLowerCase().toCharArray()){
            if (map.get(now) != null){
                map.put(now, map.get(now) + 1);
            } else {
                map.put(now, 1);
            }
        }
        int count = 0;
        for (var key : map.keySet()){
            if (map.get(key) > 1){
                count++;
            }
        }
        return count;
    }
}