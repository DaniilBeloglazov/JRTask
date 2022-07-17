package RequiredTasks._4kyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class TimeFormatter {
    public static void main(String[] args) {
        System.out.print(formatDuration(12345));
    }
    public static String formatDuration(int seconds) {
        if (seconds == 0)
            return "now";
        HashMap<String, Integer> map = new LinkedHashMap<>() {{
            put("year", 31536000);
            put("day", 86400);
            put("hour", 3600);
            put("minute", 60);
            put("second", 1);
        }};
        String answ = "";
        for (var key : map.keySet()) {
            if (seconds >= map.get(key)) {
                int current  = seconds / map.get(key);
                String add = (current > 1) ? current + " " + key + "s-" : current + " " + key + "-";
                answ += add;
                seconds = seconds % map.get(key);
            }
        }
        String[] fJoin = answ.split("-");
        return fJoin.length > 1 ? String.join(", ", Arrays.copyOf(fJoin, fJoin.length - 1)) + " and " + fJoin[fJoin.length - 1] : fJoin[0];
    }
}