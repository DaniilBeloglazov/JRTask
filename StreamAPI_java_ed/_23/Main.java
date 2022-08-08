package StreamAPI_java_ed._23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(){{
            add("a");
            add("e");
            add("c");
            add("d");
            add("b");
            add("e");
            add("b");
        }};
        list.stream().distinct().sorted().toList().forEach(System.out::println);
    }
}