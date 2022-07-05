package com.lvl9tasks.tsk19;

import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String input = cons.nextLine();
            if (input.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(input);
            String name = cons.nextLine();
            map.put(name, id);
        }

        for (String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
}
