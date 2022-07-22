package JavaRush.lvl5tasks.tsk10;

import java.util.Scanner;

class ConsoleReader {
    static String readString(){
        Scanner cons = new Scanner(System.in);
        String str = cons.nextLine();
        return str;
    }
    static int readInt(){
        Scanner cons = new Scanner(System.in);
        int intt = cons.nextInt();
        return intt;
    }
    static double readDouble(){
        Scanner cons = new Scanner(System.in);
        double db = cons.nextDouble();
        return db;
    }
    static boolean readBoolean(){
        Scanner cons = new Scanner(System.in);
        boolean bl = cons.nextBoolean();
        return bl;
    }

    // Dlya testa

    static String readString(String str){
        return str;
    }
    static int readInt(int intt){
        return intt;
    }
    static double readDouble(double db){
        return db;
    }
    static boolean readBoolean(boolean bl){
        return bl;
    }
    public static void main (String[] args){
        String a = readString();
        int b = readInt();
        boolean c = readBoolean();
        double d = readDouble();
        System.out.print(a + " " + b + " " + c + " " + d);
    }
}
