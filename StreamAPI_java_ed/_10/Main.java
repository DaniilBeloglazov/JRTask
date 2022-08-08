package StreamAPI_java_ed._10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>() {{
            add(new Human('M', 32));
            add(new Human('W', 23));
            add(new Human('M', 13));
            add(new Human('W', 67));
            add(new Human('M', 34));
            add(new Human('W', 54));
        }};
        System.out.println(humans.stream()
                .filter(obj -> obj.getAge() >= 18)
                .filter(obj -> obj.getSex() == 'M' && obj.getAge() < 60 || obj.getSex() == 'W' && obj.getAge() < 55)
                .count());
    }
}
