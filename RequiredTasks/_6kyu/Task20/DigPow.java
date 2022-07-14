package RequiredTasks._6kyu.Task20;

public class DigPow {
	public static long digPow(int n, int p) {
		long sum = 0;
		long check = n;
		String str = String.valueOf(n);
		String[] digits = str.split("");
		for (int i = 0; i < digits.length; i++){
			sum +=  (long) Math.pow(Integer.parseInt(digits[i]), p);
			p++;
		}
		if (sum >= check){
			long k = sum / check;
			return (k * check == sum) ? k : -1;
		} else
			return -1;
	}
}