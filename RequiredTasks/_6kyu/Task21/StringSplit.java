package RequiredTasks._6kyu.Task21;

public class StringSplit {
    public static void main(String[] args) {
        for (var now : solution("asdvfd")){
            System.out.println(now);
        }
    }
    public static String[] solution(String s) {
        if (s.length() % 2 != 0)
            s += "_";
        String[] str = s.split("(?<=\\G.{2})");
        return str;
    }
}