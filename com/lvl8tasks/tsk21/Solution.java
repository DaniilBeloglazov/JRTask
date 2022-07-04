package com.lvl8tasks.tsk21;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        readData();
    }
    static void readData(){
        List<Integer> list = new LinkedList<>();
        try{
            Scanner cons = new Scanner(System.in);
            while (true)
                list.add(cons.nextInt());
        } catch (InputMismatchException e){
            for (Integer num : list){
                System.out.println(num);
            }
        }
    }
}
