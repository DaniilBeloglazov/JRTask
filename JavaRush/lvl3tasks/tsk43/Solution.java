package JavaRush.lvl3tasks.tsk43;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int y = console.nextInt();
        int m = console.nextInt();
        int d = console.nextInt();
        Human Andrew = new Human(name, y, m, d);
        Andrew.printNameNBirth();
    }
}
