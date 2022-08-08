package StreamAPI_java_ed._19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(){{
            add("1,2,3");
            add("4,5,6,7,8");
            add("9,10");
        }};
        var a = list.stream()
                .flatMap((p) -> Arrays.asList(p.split(","))
                        .stream())
                .toArray(String[]::new);
        for (var now : a){
            System.out.println(now);
        }
    }
}
