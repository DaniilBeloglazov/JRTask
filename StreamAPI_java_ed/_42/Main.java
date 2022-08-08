package StreamAPI_java_ed._42;

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
            add("b4");
        }};
        System.out.println(list.stream()
                .collect(Collectors.groupingBy(
                        (p) -> p.substring(0, 1),
                        Collectors.mapping((p) -> p.substring(1, 2), Collectors.joining(":"))
                        )
                )
        );
    }
}