package StreamAPI_java_ed._17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(){{
            add("asdg");
            add("asdg");
            add("asdg");
            add("asdg");
        }};
        list.stream()
                .map(obj -> obj + "_1")
                .toList()
                .forEach(System.out::println);
    }
}
