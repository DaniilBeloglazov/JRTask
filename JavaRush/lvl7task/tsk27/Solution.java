package JavaRush.lvl7task.tsk27;

import java.util.Date;

class Solution {
    static boolean booisDateOdd(String date){
        long startTime = new Date(new Date(date).getYear(), 0, 1).getTime();
        long endTime = new Date(date).getTime();
        return (endTime - startTime) / 1000 / 60 / 60 / 24 - 1 % 2  != 0;
    }
}
