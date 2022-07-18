package RequiredTasks.OOP.Task1;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new SomeClass<>(){{
            add(1);
            add(3);
            add(4);
            add(5);
            add(6);
        }};
        list.add(0, 123);
        var check = list.get(0);
        check = 1488;
        for (var now : list){
            System.out.println(now);
        }
    }
}
