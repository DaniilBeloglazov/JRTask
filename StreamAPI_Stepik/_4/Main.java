package StreamAPI_Stepik._4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++){
            list.add(new Random().nextInt(101) + 100);
        }
        list.stream()
                .filter(obj -> obj % 5 == 0)
                .map(Math::sqrt)
                .map(obj -> "Sqrt: " + obj)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
