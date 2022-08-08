package StreamAPI_java_ed._28;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(11);
            add(123);
            add(1324);
            add(1342);
            add(123);
        }};
        System.out.println(list.stream()
                .min(Integer::compareTo)
                .get());
    }
}