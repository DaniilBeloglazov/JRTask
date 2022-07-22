package JavaRush.lvl4tasks.tsk28;

import java.text.SimpleDateFormat;
import java.util.Date;

class Solution {
    static void printCurrentDate(){
        Date current = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM YYYY");
        System.out.print(formatter.format(current));
    }
}
