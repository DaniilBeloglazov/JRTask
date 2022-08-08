package StreamAPI_java_ed._16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(){{
            add("asd");
            add("sad");
            add("ahrwk");
            add("ahweh");
            add("asdf");
        }};
        String a7 = "ahrw";
        System.out.println(list.stream().noneMatch(a7::equals));
    }
}
