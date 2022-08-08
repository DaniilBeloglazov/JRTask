package StreamAPI_Training._5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 1000));
        }
        System.out.print(list.stream().skip(2).findFirst().get());
    }
}
