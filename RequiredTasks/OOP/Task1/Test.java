package RequiredTasks.OOP.Task1;

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
        list.add(4, 132);
        list.add(0, 69);
        list.add(2, 15);
        System.out.println(list.get(4) + " " + list.get(0) + " " + list.get(2));
    }
}
