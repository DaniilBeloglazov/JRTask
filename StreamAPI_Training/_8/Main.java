package StreamAPI_Training._8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Human> mans = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mans.add(new Human("name" + i, new Random().nextInt(100)));
        }
        System.out.println(mans.stream().filter((obj) -> obj.getAge() >= 18).count());
    }
}
