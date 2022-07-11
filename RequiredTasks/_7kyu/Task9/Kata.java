package RequiredTasks._7kyu.Task9;

import java.util.List;

public class Kata {
  public static void main(String[] args) {
    for (var now : filterList(List.of(1, 2, "a", "b"))){
      System.out.println(now);
    }
  }
  public static List<Object> filterList(final List<Object> list) {
    return list.stream().filter(obj -> obj instanceof Integer).toList();
  }
}