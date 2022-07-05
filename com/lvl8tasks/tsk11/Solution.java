package com.lvl8tasks.tsk11;

import java.util.HashMap;

class Solution {
    static void except() throws Exception{
        try{
            HashMap<String, String> map = new HashMap<String, String>();
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e){
            System.out.print(e.getClass());
        }
    }
}
