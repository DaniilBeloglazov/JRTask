package StreamAPI_java_ed._30;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>(){{
            add(new Human("Alex",'M',23));
            add(new Human("Connor",'M', 34));
            add(new Human("Bennet", 'M', 17));
            add(new Human("Ann", 'W', 25));
        }};
        System.out.println(list.stream()
                .min(Comparator.comparing(Human::getAge))
                .get());
    }
}
