package RequiredTasks._6kyu.Task15;

import java.lang.StringBuilder;
class Solution{
  public static void main(String[] args) {
    toCamelCase("the-stealth-warrior");
  }
  static String toCamelCase(String s){
    String[] str = s.split("[-_]");
    StringBuilder build = new StringBuilder();
    build.append(str[0]);
    for (int i = 1; i < str.length; i++){
      build.append(str[i].substring(0,1).toUpperCase() + str[i].substring(1));
    }
    return build.toString();
  }
}