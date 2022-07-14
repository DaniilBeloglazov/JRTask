package RequiredTasks._6kyu.Task18;

import java.util.Arrays;
import java.util.List;

public class PangramChecker {
  public static void main(String[] args) {
    System.out.print(check("td w ozy ghjakcn epumxrsq bl fv"));
  }
  public static boolean check(String sentence){
    String[] alpha = new String[26];
    for (char i = 'a'; i <= 'z'; i++) {
      alpha[i - 'a'] = String.valueOf(i);
    }
    List list = Arrays.asList(sentence.toLowerCase().replaceAll("[^a-z]", "").split(""));
    return list.containsAll(Arrays.asList(alpha));
  }
}