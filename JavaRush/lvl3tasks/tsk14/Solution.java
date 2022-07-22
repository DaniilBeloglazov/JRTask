package JavaRush.lvl3tasks.tsk14;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        isLeapYear(1700);
    }
    public static void isLeapYear(int numOfYear){
        if (numOfYear % 4 == 0){
            if (numOfYear % 100 == 0 && numOfYear % 400 != 0)
                System.out.print("количество дней в году: 365");
            else
                System.out.print("количество дней в году: 366");
        } else
            System.out.print("количество дней в году: 365");
    }
}
