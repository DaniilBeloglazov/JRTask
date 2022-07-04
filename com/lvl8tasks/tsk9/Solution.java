package com.lvl8tasks.tsk9;

class Solution {
    static void except() throws Exception{
        try{
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.print(e.getClass());
        }
    }
}
