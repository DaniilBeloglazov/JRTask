package RequiredTasks.OOP.Task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(1);
        for(int i: removeDuplicates(list)){
            System.out.println(i);
        }
    }
    public static <T> Collection<T> removeDuplicates(Collection<T> collection){
        return new HashSet<>(){{addAll(collection);}};
    }
}
