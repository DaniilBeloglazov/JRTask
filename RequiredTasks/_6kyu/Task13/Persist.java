package RequiredTasks._6kyu.Task13;

class Persist {
	public static void main(String[] args) {
		System.out.print(persistence(999));
	}
	public static int persistence(long n) {
		if (n < 10)
			return 0;
		long newN = 1;
		while (n > 0){
			newN = n % 10 * newN;
			n /= 10;
		}
		return persistence(newN) + 1;
	}
}