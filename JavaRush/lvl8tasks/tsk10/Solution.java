package JavaRush.lvl8tasks.tsk10;

import java.util.ArrayList;

class Solution {
    static void except() throws Exception{
        try{
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e){
            System.out.print(e.getClass());
        }
    }
}
