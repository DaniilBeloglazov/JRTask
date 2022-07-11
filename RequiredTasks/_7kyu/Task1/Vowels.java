package RequiredTasks._7kyu.Task1;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        vowelsCount = str.replaceAll("[^aeiou]", "").length();
        return vowelsCount;
    }

}
