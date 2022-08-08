package StreamAPI_java_ed._36;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(15);
            add(1);
            add(23);
            add(4);
        }};
        System.out.println(list.stream()
                .collect(Collectors.partitioningBy((num) -> num % 2 == 0))
        );
    }
}