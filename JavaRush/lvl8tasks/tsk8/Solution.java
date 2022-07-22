package JavaRush.lvl8tasks.tsk8;

class Solution {
    static void excep() throws Exception{
        try{
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e){
            System.out.print(e.getClass());
        }
    }
}
