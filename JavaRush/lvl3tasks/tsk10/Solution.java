package JavaRush.lvl3tasks.tsk10;

public class Solution {
    public static void checkInterval(int num){
        if (num >= 50 && num <= 100)
            System.out.print("Число " + num + " содержится в интервале.");
        else
            System.out.print("Число " + num + " не содержится в интервале.");
    }
}
