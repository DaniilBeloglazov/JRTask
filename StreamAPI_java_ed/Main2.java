package StreamAPI_java_ed;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main2 {
    // Вернуть первый элемент коллекции или 0, если коллекция пуста
    public static void main(String[] args) {
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> list = new ArrayList<>() {{
            add(24);
            add(2);
            add(3);
        }};
        System.out.println(firstElemOrNull(emptyList));
        System.out.println(firstElemOrNull(list));
    }

    public static int firstElemOrNull(List<Integer> list) {
        Optional<Integer> first = list.stream().findFirst();
        return first.orElse(0);
    }
}
