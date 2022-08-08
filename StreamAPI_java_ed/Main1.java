package StreamAPI_java_ed;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        //TODO Вернуть количество вхождений объекта «a1»
        List<Integer> list = new ArrayList<>();
        list.add(828);
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 1000));
        }
        Integer a1 = 828;
        list.add(a1);
        list.forEach(System.out::println);
        System.out.println("count of " + a1 + " in this list: " + list.stream()
                .filter(a1::equals)
                .count());
    }
}
