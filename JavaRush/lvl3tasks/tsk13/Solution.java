package JavaRush.lvl3tasks.tsk13;
public class Solution {
    public static String numOfWeek[] = {"понедельник","вторник","среда","четверг","пятница","суббота","воскресенье"};
    public static void printWeekName(int num){
        if (num <= 7 && num >= 1)
            System.out.print(numOfWeek[num - 1]);
        else
            System.out.print("такого дня недели не существует");
    }
}
