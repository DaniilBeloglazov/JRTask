package com.lvl7tasks.tsk23;

import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner cons = new Scanner(System.in);
        String inp = cons.nextLine();
        toUpperCFirstLet(inp);
    }
    static void toUpperCFirstLet(String s){
        for (String word : s.split("\\b")){
            System.out.print(word.substring(0,1).toUpperCase() + word.substring(1));
        }
    }
}
