package JavaRush.lvl2tasks.tsk2;


public class Solution {
    public static void main(String[] args){
        System.out.println(convertEurToUsd(6,63.37));
        System.out.print(convertEurToUsd(1,56.87));
    }
    public static double convertEurToUsd(int euro, double course){
        return euro * course;
    }
}

