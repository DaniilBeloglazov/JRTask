package StreamAPI_Stepik._3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i  = 0; i < 100; i ++){
            list.add((int)(Math.random() * 1000));
        }
        List<String> listSTR = list.stream()
                .filter(obj -> obj % 2 == 0)
                .map(objInt -> "Number: " + objInt)
                .filter(obj -> obj.endsWith("0"))
                .map(obj -> obj += "!")
                .collect(Collectors.toList());
        listSTR.forEach(System.out::println);
    }
}