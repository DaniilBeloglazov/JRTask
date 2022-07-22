package JavaRush.lvl2tasks.tsk17;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        inPS(name, num1, num2);
    }
    public static void inPS(String name, int getsum, int years){
        System.out.print(name + " получает " + getsum + " через " + years + " лет.");
    }
}
