package JavaRush.lvl7task.tsk10;

import java.util.Date;
import java.util.List;

class Solution {
    static void insert10000(List list) {
        for( int i = 0; i < 10_000; i++){
            list.add(i);
        }
    }
    static void get10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }
    static  long getTimeOfGet(List list){
        long start = new Date().getTime();
        get10000(list);
        long end = new Date().getTime();
        return (end - start);
    }
}
