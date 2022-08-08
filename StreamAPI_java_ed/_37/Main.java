package StreamAPI_java_ed._37;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(){{
            add("asd");
            add("sad");
            add("sfg");
            add("asd");
        }};
        System.out.println(list.stream()
                .distinct()
                .toList()
        );
    }
}