package StreamAPI_java_ed;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main3 {
    //Вернуть последний элемент коллекции или «empty», если коллекция пуста
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(123);
            add(1343);
            add(5433);
            add(777);
        }};
        Optional<Integer> lastElem =  list.stream().skip(list.size() - 1).findFirst();
        if (lastElem.isPresent()){
            System.out.println(lastElem.get());
        } else {
            System.out.println("empty");
        }
    }
}
