package com.lvl9tasks.tsk20;

import java.util.*;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            list.add(cons.nextInt());
        }
        Collections.sort(list);
        System.out.println(list.get(9));
        System.out.print(list.get(10));
    }
}
