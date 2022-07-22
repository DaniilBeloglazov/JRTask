package JavaRush.lvl3tasks.tsk19;

import java.util.TreeSet;

public class Solution {
    public static void main(String[] args){
        printMaxof4(1,4,23,5);
    }
    public static void printMaxof4(int a, int b, int c, int d){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        System.out.print(set.last());
    }
}
