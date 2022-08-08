package StreamAPI_java_ed._26;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>(){{
            add(new Human("Alex",'M',23));
            add(new Human("Connor",'M', 34));
            add(new Human("Bennet", 'M', 17));
            add(new Human("Ann", 'W', 25));
        }};
        list.stream()
                .sorted((hum1, hum2) -> hum1.getSex() != hum2.getSex()
                        ? hum1.getSex().compareTo(hum2.getSex())
                        : hum1.getAge().compareTo(hum2.getAge()))
                .toList()
                .forEach(System.out::println);
    }
}
