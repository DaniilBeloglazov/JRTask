package StreamAPI_Stepik._2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i  = 0; i < 100; i ++){
            list.add((int)(Math.random() * 1000));
        }
        filter(list, (obj) -> obj % 2 == 0).forEach(System.out::println);
    }
    public static List<Integer> filter(List<Integer> listForFilter, CustomPredicate predicate){
        List<Integer> answer = new ArrayList<>();
        for (int i : listForFilter){
            if (predicate.test(i)){
                answer.add(i);
            }
        }
        return answer;

    }
}
