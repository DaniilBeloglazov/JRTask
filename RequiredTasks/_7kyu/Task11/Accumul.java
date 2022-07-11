package RequiredTasks._7kyu.Task11;

public class Accumul {

    public static String accum(String s) {
        String[] str = s.split("");
        for (int i = 0; i < str.length; i++){
            str[i] = str[i].toUpperCase() + str[i].repeat(i).toLowerCase();
        }
        return String.join("-", str);
    }
}