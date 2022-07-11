package RequiredTasks._6kyu.Task8;

public class BitCounting {

    public static int countBits(int n){
        char[] arr = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for (char now : arr){
            if (now == '1'){
                count++;
            }
        }
        return count;
    }
}
