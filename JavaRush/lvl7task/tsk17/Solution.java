package JavaRush.lvl7task.tsk17;

import java.util.*;

class Solution {
    static void deleteEqualsName(Map<String, String> map){
        List<String> list = new LinkedList<>(map.values());

        for (String s : list) {
            Map<String, String> mapcopy = new HashMap<>(map);
            if (Collections.frequency(map.values(), s) > 1) {
                for (var pair : mapcopy.entrySet()){
                    if (pair.getValue().equals(s)){
                        map.remove(pair.getKey());
                    }
                }
            }
        }
    }
}
