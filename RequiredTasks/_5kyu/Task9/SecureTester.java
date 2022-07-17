package RequiredTasks._5kyu.Task9;

public class SecureTester{
  
  public static boolean alphanumeric(String s){
    return s.length() >= 1 && s.split("[A-Za-z0-9]").length == 0;
  }

}