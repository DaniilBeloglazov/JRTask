package RequiredTasks._6kyu.Task12;

public class Kata
{
  public static void main(String[] args) {
    System.out.print(AlphabetPosition("The narwhal bacons at midnight."));
  }
  public static String AlphabetPosition(String text) {
    char[] chrs = text.toLowerCase().replaceAll("[^a-z]","").toCharArray();
    String[] str = new String[chrs.length];
    for (int i = 0; i < chrs.length; i++){
      str[i] = String.valueOf(Character.getNumericValue(chrs[i]) - 9);
    }
    return String.join(" ", str);
  }
}