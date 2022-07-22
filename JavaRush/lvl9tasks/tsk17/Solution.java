package JavaRush.lvl9tasks.tsk17;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner cons = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            list.add(cons.nextInt());
        }
        System.out.print(safeGetElement(list, 21, -1));
    }
    static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) throws Exception{
        try {
            return list.get(index);
        } catch (Exception e){
            return defaultValue;
        }
    }
}
