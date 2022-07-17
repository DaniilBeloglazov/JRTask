package RequiredTasks._5kyu.Task1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static void main(String[] args) {
        System.out.print(pigIt("Hello world !"));
    }
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" ")).map(obj -> (obj.matches("[A-Z[a-z]]+")) ? obj.substring(1) + obj.substring(0, 1) + "ay" : obj).collect(Collectors.joining(" "));
    }
}