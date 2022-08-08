package StreamAPI_Training._7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(){{
            add("asd.");
            add("rt?");
            add("terg");
            add("jreg");
            add("rtjtye!");
        }};
        String regex = ".*[!.?]"; // string with ! . or ? at the end
        list.stream().filter((s) -> s.matches(regex)).toList().forEach(System.out::println);
    }
}
