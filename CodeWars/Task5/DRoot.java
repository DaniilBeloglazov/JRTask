package CodeWars.Task5;

public class DRoot {
    public static int digital_root(int n) {
        if (n == 0)
            return 0;
        else {
            int ret = n % 10 + digital_root(n / 10);
            return (ret >= 10) ? digital_root(ret) : ret;
        }
    }
}
