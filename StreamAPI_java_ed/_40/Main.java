package StreamAPI_java_ed._40;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() {{
            add("a1");
            add("b2");
            add("c3");
            add("d4");
        }};
        System.out.println(list.stream()
                .collect(Collectors.toMap(obj -> obj.substring(0, 1), obj -> obj.substring(1, 2)))
        );
    }
}