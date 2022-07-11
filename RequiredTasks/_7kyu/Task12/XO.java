package RequiredTasks._7kyu.Task12;

import java.util.Arrays;

public class XO {
  public static void main(String[] args) {
    System.out.print(getXO("xxxooo"));
  }
  public static boolean getXO (String str) {
    str = str.toLowerCase();
    String[] stArr = str.split("");
    int o = Arrays.stream(stArr).filter(obj -> obj.equals("o")).toArray().length;
    int x = Arrays.stream(stArr).filter(obj -> obj.equals("x")).toArray().length;
    if (x == o)
      return true;
    else
      return false;
  }

}