package StreamAPI_java_ed._9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Man> list = new ArrayList<>() {{
            add(new Man(34));
            add(new Man(23));
            add(new Man(54));
            add(new Man(67));
        }};
        double avg = list.stream()
                .mapToInt(Man::getAge)
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
