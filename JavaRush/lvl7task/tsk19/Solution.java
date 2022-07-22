package JavaRush.lvl7task.tsk19;

import java.util.HashSet;
import java.util.Set;

class Solution {
    static HashSet<Cat> createCats() {
        HashSet<Cat> set = new HashSet<>() {{
            add(new Cat());
            add(new Cat());
            add(new Cat());
        }};
        return set;
    }
    static void printCats(Set<Cat> cats){
        cats.forEach(System.out::println);
    }
    static class Cat{
    }
}
