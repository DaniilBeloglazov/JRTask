package RequiredTasks._5kyu.Task3;

public class Solution{
  public static void main(String[] args) {
    System.out.print(validParentheses(" ()()((() "));
  }
  public static boolean validParentheses(String parens)
  {
    char[] parensChr = parens.replaceAll("[^()]", "").toCharArray();
    int count = 0;
    for (int i = 0; i < parensChr.length; i++) {
      if (parensChr[i] == '(')
        count++;
      else {
        count--;
        if (count < 0)
          return false;
      }
    }
    return count == 0;
  }
}