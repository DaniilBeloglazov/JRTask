package com.lvl8tasks.tsk22;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        printDateAfterFormat(cons.nextLine());
    }
    static void printDateAfterFormat(String date){
        Date dt = new Date(date);
        SimpleDateFormat fm = new SimpleDateFormat("MMM dd, YYYY");
        System.out.print(fm.format(dt).toUpperCase());
    }
}
