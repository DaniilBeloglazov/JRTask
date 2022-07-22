package JavaRush.lvl3tasks.tsk9;

public class Solution {
    public static void closeToTen(int num1, int num2){
        int l1 = Math.abs(10 - num1);
        int l2 = Math.abs(10 - num2);
        if (l1 < l2)
            System.out.print(num1);
        else if (l1 >= l2)
            System.out.print(num2);
    }
}
