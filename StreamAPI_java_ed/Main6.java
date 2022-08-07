package StreamAPI_java_ed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(2345);
            add(1);
            add(3);
            add(2345);
        }};
        System.out.println(Arrays.toString(list.stream().skip(1).limit(2).toArray()));
    }
}
