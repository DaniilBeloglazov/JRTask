package JavaRush.lvl7task.tsk8;

import java.util.List;

class Solution {
    static void insert10000(List list) {
        for( int i = 0; i < 10000; i++){
            list.add(i);
        }
    }

    static void get10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    static void set10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.set(i, list.get(i));
        }
    }

    static void remove10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }
    }
}
