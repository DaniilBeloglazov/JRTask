package RequiredTasks._5kyu.Task4;

import java.util.Arrays;
import java.util.Comparator;

public class WeightSort {
	public static String orderWeight(String string) {
		String[] str = string.split(" ");
		Comparator<String> compByWeight = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				long x = getWeight(Long.parseLong(o1));
				long y = getWeight(Long.parseLong(o2));
				if (x < y)
					return -1;
				else if (x == y) {
					return o1.compareTo(o2);
				} else
					return 0;
			}
		};
		Arrays.sort(str, compByWeight);
		return String.join(" ", str);
	}
	public static int getWeight(long num){
		int sum = 0;
		while (num != 0){
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}