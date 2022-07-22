package JavaRush.lvl3tasks.tsk29;

import java.util.Scanner;
import java.util.Vector;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int a = console.nextInt() ,b = console.nextInt(), c = console.nextInt();
        printCountOfPosNNeg(a, b, c);
    }
    protected static final void printCountOfPosNNeg(int a, int b, int c){
        int countPos = 0;
        int countNeg = 0;
        Vector<Integer> vec = new Vector<>(){{
            add(a);
            add(b);
            add(c);
        }};
        for (var now:vec){
            if (now > 0)
                countPos+=1;
            else
                countNeg+=1;
        }
        System.out.println("количество отрицательных чисел: " + countNeg);
        System.out.print("количество положительных чисел: " + countPos);
    }
}

