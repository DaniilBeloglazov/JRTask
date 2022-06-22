package com.lvl1tasks.tsk3;
// Секунд с последнего часа
public class Solution {
    public static void main(String[] args){
        System.out.print(getCountSecondsPassedInCurrentHour(12345));
    }
    public static int getCountSecondsPassedInCurrentHour(int seconds){
        return seconds % 3600;
    }
}
