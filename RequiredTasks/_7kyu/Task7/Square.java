package RequiredTasks._7kyu.Task7;

public class Square {
    public static boolean isSquare(int n) {        
        double sqrt = Math.sqrt(n);
        return (sqrt % 1 == 0);
    }
}