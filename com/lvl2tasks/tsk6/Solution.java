package com.lvl2tasks.tsk6;

public class Solution {
    public static String[] zergs = new String[10];
    public static String[] protosses = new String[5];
    public static String[] terrans = new String[12];
    public static void main (String[] args){
    }
    public static void fillAll(){
        for (int i = 0; i < zergs.length; i++){
            zergs[i] = "Zerg" + i;
        }
        for (int i = 0; i < terrans.length; i++){
            terrans[i] = "Terran" + i;
        }
        for (int i = 0; i < protosses.length; i++){
            protosses[i] = "Protoss" + i;
        }
    }
    public static boolean unic(String[] str){
        for (int i = 0; i < str.length - 1; i++){
            for (int j = i + 1; j < str.length; j++){
                if (str[i] == str[j])
                    return false;
            }
        }
        return true;
    }
}

