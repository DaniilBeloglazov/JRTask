package JavaRush.lvl3tasks.tsk15;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int a = console.nextInt(), b = console.nextInt(), c = console.nextInt();
        isTriangleExist(a, b, c);
    }
    public static void isTriangleExist(int a, int b, int c){
        if (a < b + c && b < a + c && c < b + a){
            System.out.print("Треугольник существует.");
        } else {
            System.out.print("Треугольник не существует.");
        }
    }
}
