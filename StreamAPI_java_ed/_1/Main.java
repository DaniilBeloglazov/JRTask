package StreamAPI_java_ed._1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            list.add((int)(Math.random() * 1000));
        }
        Integer a1 = console.nextInt();
        long count = list.stream()
                .filter(a1::equals)
                .count();
        System.out.println(count);
    }
}
