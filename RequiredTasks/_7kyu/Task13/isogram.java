package RequiredTasks._7kyu.Task13;

import java.util.Arrays;
import java.util.HashSet;

public class isogram {
    public static void main(String[] args) {
        System.out.print(isIsogram("moOse"));
    }
    public static boolean  isIsogram(String str) {
        if(str == null)
            return true;
        int size = str.length();
        HashSet<Character> set = new HashSet<>();
        for (var now : str.toLowerCase().toCharArray()){
            set.add(now);
        }
        if (size == set.size())
            return true;
        else
            return false;
    } 
}