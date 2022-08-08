package StreamAPI_Training._3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> emptyList = new ArrayList<>();
        List<String> notEmptyList = new ArrayList<>() {{
            add("Junior");
            add("Middle");
            add("Senior");
        }};
        printLastElement(notEmptyList);
        printLastElement(emptyList);
    }

    static <T> void printLastElement(Collection<T> collection) {
        if (collection.size() == 0)
            System.out.println("Collection is empty");
        else {
            Optional<T> check = collection.stream()
                    .skip(collection.size() - 1)
                    .findFirst();
            System.out.println(check.get());
        }
    }
}
