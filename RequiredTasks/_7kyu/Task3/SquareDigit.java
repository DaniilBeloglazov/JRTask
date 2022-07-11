package RequiredTasks._7kyu.Task3;

public class SquareDigit {

    public static int squareDigits(int n) {
        String answ = "";
        do {
            answ = (n % 10) * (n % 10) + answ;
            n /= 10;
        } while (n != 0);
        return Integer.parseInt(answ);
    }

}
