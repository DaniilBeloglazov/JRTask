package JavaRush.lvl3tasks.tsk25;

public class Solution {
    public static final void whichQuater(int x, int y){
        String result = (x > 0) ? (y > 0) ? "1" : "4" : (y > 0)? "2" : "3";
        System.out.print(result);
    }
}
