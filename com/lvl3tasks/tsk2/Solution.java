package com.lvl3tasks.tsk2;

public class Solution {
    public void main(String[] args){
        addPrice(25);
    }
    public static int applesPrice;
    public static void addPrice(int applesPrice){
        Solution.applesPrice += applesPrice;
        System.out.print(applesPrice);
    }

}
