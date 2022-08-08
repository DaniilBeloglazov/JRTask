package StreamAPI_java_ed;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    // TODO Найти элемент в коллекции равный «a3» или кинуть ошибку
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(123);
            add(532);
            add(1235);
            add(213123);
        }};
        Integer a3 = 5323;
        list.stream().filter(a3::equals).findFirst().get();
    }
}
