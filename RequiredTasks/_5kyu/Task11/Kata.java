package RequiredTasks._5kyu.Task11;


public class Kata {
	public static void main(String[] args) {
		longToIP(2149583361L);
	}
	public static String longToIP(long ip) {
		return String.format("%d.%d.%d.%d", ip>>>24, ip>>16 & 0xff, ip>>>8 & 0xff, ip & 0xff);
	}
}