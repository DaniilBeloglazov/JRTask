package RequiredTasks._5kyu.Task12;

public class PerfectPower {
  public static void main(String[] args) {
    for(var now : isPerfectPower(4))
      System.out.println(now);
  }
  public static int[] isPerfectPower(int n) { // m ** k = n  m > 1 k > 1
    for (int digit = 2; digit <= (int)Math.sqrt(n); digit++){
      int number = n;
      int power = 0;
      while (number % digit == 0){
        number /= digit;
        power++;
        if (number == 1)
          return new int[]{digit, power};
      }
    }
    return null;
  }
}