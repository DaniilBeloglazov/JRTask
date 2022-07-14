package RequiredTasks._6kyu.Task17;

public class Xbonacci {

  public double[] tribonacci(double[] s, int n) { // 3 digits in S and n >= 0
    double[] arr = new double[n];
    for (int i = 0; i < n; i++){
      if (i < 3)
        arr[i] = s[i];
      else
        arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
    }
    return arr;
  }
}