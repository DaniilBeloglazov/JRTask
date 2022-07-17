package RequiredTasks._5kyu.Task6;

public class Scramblies {
    public static void main(String[] args) {
        System.out.print(scramble("scriptjavx","javascript"));
    }
    public static boolean scramble(String str1, String str2) {
        for (var letter : str1.split("")){
            if (str2.contains(letter))
                str2 = str2.replaceFirst(letter, "");
        }
        return str2.length() == 0;
    }
}