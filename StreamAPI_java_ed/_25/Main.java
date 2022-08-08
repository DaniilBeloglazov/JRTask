package StreamAPI_java_ed._25;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>(){{
            add(new Human("Alex"));
            add(new Human("Connor"));
            add(new Human("Bennet"));
            add(new Human("Ann"));
        }};
        list.stream()
                .map(Human::getName)
                .sorted(Comparator.reverseOrder())
                .toList()
                .forEach(System.out::println);
    }
}
