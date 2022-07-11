package RequiredTasks._7kyu.Task10;

public class JadenCase {
	public static void main(String[] args) {
		System.out.print(toJadenCase("most trees are blue"));
	}
	public static String toJadenCase(String phrase) {
		if (phrase == null || phrase.isEmpty())
			return null;
		String[] str = phrase.split(" ");
		for (int i = 0; i < str.length; i++){
			str[i] = str[i].substring(0,1).toUpperCase() + str[i].substring(1);
		}
		return String.join(" ", str);
	}

}