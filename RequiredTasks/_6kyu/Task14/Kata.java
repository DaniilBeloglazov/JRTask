package RequiredTasks._6kyu.Task14;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static void main(String[] args) {
        for (var now : uniqueInOrder("12233"))
            System.out.println(now);
    }
    public static List uniqueInOrder (String n){
        List<Character> result = new ArrayList<>();
        char[] chrs = n.toCharArray();
        Character last = null;
        for (int i = 0; i < chrs.length; i++){
            if (last == null || chrs[i] != last){
                last = chrs[i];
                result.add(last);
            }
        }
        return result;
    }
}
