package StreamAPI_java_ed._11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(4);
            add(3);
            add(4);
            add(5);
            add(6);
        }};
        list.stream().distinct().toList().forEach(System.out::println);
    }
}
