package JavaRush.lvl3tasks.tsk17;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        isPareExist(a, b, c);
    }
    static final void isPareExist(int a, int b, int c) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(a, (map.get(a) == null) ? 1 : map.get(a) + 1);
        map.put(b, (map.get(b) == null) ? 1 : map.get(b) + 1);
        map.put(c, (map.get(c) == null) ? 1 : map.get(c) + 1);
        for (Integer key : map.keySet()) {
            if (map.get(key) == 3)
                System.out.print(key + " " + key + " " + key);
            if (map.get(key) == 2)
                System.out.print(key + " " + key);
        }
    }
}
