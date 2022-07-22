package JavaRush.lvl3tasks.tsk42;

import java.util.Scanner;

public class Solution {
    public static int sum = 1;
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int input;
        do{
            input = console.nextInt();
            calcSum(input);
        } while (input != -1);
        System.out.print(sum);
    }
    public static final void calcSum(int num){
        sum += num;
    }
}
