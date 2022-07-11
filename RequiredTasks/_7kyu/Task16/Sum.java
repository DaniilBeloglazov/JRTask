package RequiredTasks._7kyu.Task16;

public class Sum
  {
     public static int GetSum(int a, int b)
     {
         if (a == b)
             return a;
         else if (a > b)
             return a + GetSum(a-1,b);
         else
             return a + GetSum(a+1,b);
     }

  }