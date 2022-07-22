package JavaRush.lvl2tasks.tsk10;

public class Solution {
    public static void main(String[] args){
        System.out.println(convertToSeconds(3));
        System.out.println(convertToSeconds(12));
    }
    public static int convertToSeconds(int hour){
        return hour * 3600;
    }
}
