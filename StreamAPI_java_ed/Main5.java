package StreamAPI_java_ed;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(1263543);
            add(123453);
            add(3333333);
            add(134);
        }};
        System.out.println(list.stream().skip(2).findFirst().get());
    }
}
