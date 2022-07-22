package JavaRush.lvl8tasks.tsk12;

class Solution {
    static void except() throws Exception{
        try{
            int num=Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e){
            System.out.print(e.getClass());
        }
    }
}
