package StreamAPI_java_ed._18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        Integer[] answer = (list.stream().skip(1).toArray(Integer[]::new));
        for (var now : answer){
            System.out.println(now);
        }
    }
}
