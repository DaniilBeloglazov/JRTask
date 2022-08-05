package StreamAPI_Stepik._5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>() {{
            add(new User("John", 23));
            add(new User("Alex", 34));
            add(new User("Daniel", 23));
            add(new User("Steve", 26));
            add(new User("Rick", 45));
            add(new User("Morty", 78));
        }};
        users.stream()
                .filter(obj -> obj
                        .getUsername()
                        .contains("l"))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));
    }
}
