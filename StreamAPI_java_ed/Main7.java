package StreamAPI_java_ed;

import java.util.ArrayList;
import java.util.List;пше

public class Main7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(){{
            add("asdbtrn");
            add("asdkit");
            add("asgerhjyd");
            add("asdwdwq");
            add("asasbrtd");
        }};
        String regex = ".*[d]";
        list.stream()
                .filter(obj -> obj.matches(regex))
                .toList()
                .forEach(System.out::println);
    }
}
