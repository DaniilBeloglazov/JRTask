package RequiredTasks._6kyu.Task19;

class Kata
{
  public static void main(String[] args) {
    System.out.print(Narcissistic(153));
  }
  public static boolean Narcissistic(int value)
  {
    String number = String.valueOf(value);
    int numOfDigits = number.length();
    String[] nums = number.split("");
    int sum = 0;
    for (var num : nums){
      sum += Math.pow(Integer.parseInt(num), numOfDigits);
    }
    return sum == value;
  }
}