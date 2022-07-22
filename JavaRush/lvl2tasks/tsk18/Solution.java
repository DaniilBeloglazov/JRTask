package JavaRush.lvl2tasks.tsk18;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        outP(name);
    }
    public static void outP(String name){
        System.out.print(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
