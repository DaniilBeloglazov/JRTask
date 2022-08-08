package StreamAPI_Training._6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 1000));
        }
        System.out.print(Arrays.toString(list.stream().skip(1).limit(2).toArray()));
    }
}