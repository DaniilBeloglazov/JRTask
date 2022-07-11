package RequiredTasks._7kyu.Task4;

import static java.util.Arrays.stream;

public class Kata {
    public static void main(String[] args) {
        System.out.print(highAndLow("1 2 -3 4 5"));
    }
    public static String highAndLow(String numbers) {
        var stat = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return stat.getMax() + " " + stat.getMin();
    }
}
