package RequiredTasks._7kyu.Task14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kata {
    public static int findShort(String s) {
        List<String> list = Arrays.asList(s.split(" "));
        Collections.sort(list, Comparator.comparing(String::length));
        return list.get(0).length();
    }
}