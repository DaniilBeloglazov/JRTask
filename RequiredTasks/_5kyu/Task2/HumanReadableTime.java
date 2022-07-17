package RequiredTasks._5kyu.Task2;

public class HumanReadableTime {
  public static void main(String[] args) {
    System.out.print(makeReadable(60));
  }
  public static String makeReadable(int seconds) {
    int m = seconds / 60;
    seconds %= 60;
    int h = m / 60;
    m %= 60;
    return "%02d:%02d:%02d".formatted(h, m, seconds);
  }
}