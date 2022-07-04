package com.lvl8tasks.tsk19;

class Solution {
    public static void main(String[] args){
        try{
            divisionByZero();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void divisionByZero(){
        int n = 5 / 0;
        System.out.print(n);
    }
}
