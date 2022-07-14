package RequiredTasks._6kyu.Task16;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
  public static String order(String words) {
    String[] str = words.split(" ");
    Comparator<String> comp = (o1, o2) -> {
     int x = Integer.parseInt(o1.replaceAll("[^0-9]", ""));
     int y = Integer.parseInt(o2.replaceAll("[^0-9]", ""));
     return Integer.compare(x, y);
    };
    Arrays.sort(str, comp);
    return String.join(" ", str);
  }
}