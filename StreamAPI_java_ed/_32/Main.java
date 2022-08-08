package StreamAPI_java_ed._32;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(15);
            add(1);
            add(23);
            add(4);
        }};
        System.out.println(list.stream().max(Integer::compareTo).orElse(-1));
    }
}