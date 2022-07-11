package RequiredTasks._7kyu.Task8;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

  public static int sortDesc(final int num) {
    String[] str = String.valueOf(num).split("");
    Arrays.sort(str, Collections.reverseOrder());
    return Integer.parseInt(String.join("", str));
  }

}
