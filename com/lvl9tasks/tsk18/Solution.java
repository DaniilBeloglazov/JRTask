package com.lvl9tasks.tsk18;

import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        while (true){
            int key = cons.nextInt();
            if (key == -1)
                break;
            cons.nextLine();
            String val = cons.nextLine();
            map.put(key, val);
        }
        for (Integer key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
}
