package com.lvl2tasks.tsk11;
import java.lang.*;
public class Solution {
    public static void main(String[] args){
        String[] test = { "Мама", "Мыла", "Раму"};
        permute(3, test, "");
    }
    public static void permute(int n, String[] inp, String currentWord) {
        if (n == 0) {
            System.out.println(currentWord);
        } else {
            for (int i = 0; i < inp.length; i++) {
                if (currentWord.contains(inp[i]) == false) {
                    permute(n - 1, inp, currentWord + inp[i]);
                }
            }
        }
    }
}