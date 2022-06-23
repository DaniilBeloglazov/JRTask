package com.lvl2tasks.tsk4;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(){
        Date birth = new Date(100,11,17);
        SimpleDateFormat f = new SimpleDateFormat("MMMMM dd yyyy");
        System.out.print((f.format(birth).toUpperCase()));
    }
}
