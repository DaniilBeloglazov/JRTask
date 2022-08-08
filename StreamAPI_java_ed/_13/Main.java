package StreamAPI_java_ed._13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(123);
            add(5);
        }};
        int a1 = 123;
        System.out.println(list.stream()
                .anyMatch(obj -> obj.equals(a1)));
    }
}
