package StreamAPI_java_ed._15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(){{
            add("asdr1");
            add("asdr2");
            add("a1sdr3");
            add("asdr1");
            add("asdr1");
        }};
        System.out.println(list.stream().allMatch(obj -> obj.contains("1")));
    }
}
