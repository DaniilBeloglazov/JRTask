package RequiredTasks._7kyu.Task2;

public class Troll {
    public static String disemvowel(String str) {
        str = str.replaceAll("[aeuioAEUIO]", "");
        return str;
    }
}
