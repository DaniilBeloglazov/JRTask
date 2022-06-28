package com.lvl3tasks.tsk26;

public class Solution {
    public static final String whichDig(int a){
        if (a == 0){
            return "ноль";
        }
        String even = (a % 2 == 0) ? "четное" : "нечетное";
        String sign = (a > 0) ? "положительное" : "отрицательное";
        return(sign + " " + even + " число");
    }
}
