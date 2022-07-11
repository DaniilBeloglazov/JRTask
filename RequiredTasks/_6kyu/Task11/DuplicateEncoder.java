package RequiredTasks._6kyu.Task11;

import java.util.HashMap;

public class DuplicateEncoder {
	static String encode(String word){
        char[] chrs = word.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (var key : chrs){
            if (map.get(key) != null)
                map.put(key, map.get(key) + 1);
            else
                map.put(key, 1);
        }
        StringBuilder builder = new StringBuilder();
        for (var key : chrs){
            if (map.get(key) > 1)
                builder.append(")");
            else
                builder.append("(");
        }
        return builder.toString();
   }
}