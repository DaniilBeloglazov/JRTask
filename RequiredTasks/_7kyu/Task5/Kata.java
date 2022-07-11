package RequiredTasks._7kyu.Task5;

class Kata {
    public static String getMiddle(String word) {
        String[] str = word.split("");
        int mid = str.length / 2;
        return (str.length % 2 != 0) ? str[mid] : str[mid - 1] + str[mid];
    }
}
