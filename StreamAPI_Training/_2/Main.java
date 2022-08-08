package StreamAPI_Training._2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> emptyList = new ArrayList<>();
        List<String> notEmptyList = new ArrayList<>(){{
            add("Haha");

        }};
        printFirstElement(emptyList);
        printFirstElement(notEmptyList);
    }

    static <T> void  printFirstElement(Collection<T> collection) {
        Optional<T> check = collection.stream()
                .findFirst();
        check.ifPresentOrElse(System.out::println, () -> System.out.println("Collection is empty"));
    }
}
