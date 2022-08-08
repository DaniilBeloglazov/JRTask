package StreamAPI_java_ed._21;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(){{
            add("a");
            add("e");
            add("c");
            add("d");
            add("b");
        }};
        list.stream().sorted().toList().forEach(System.out::println);
    }
}
