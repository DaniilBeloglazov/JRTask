package com.lvl7task.tsk9;

import java.util.Date;
import java.util.List;

class Solution{
    static void insert10000(List list) {
        for( int i = 0; i < 10_000; i++){
            list.add(i);
        }
    }
    static  long getTimeOfInsert(List list){
        long start = new Date().getTime();
        insert10000(list);
        long end = new Date().getTime();
        return (end - start);
    }
}
