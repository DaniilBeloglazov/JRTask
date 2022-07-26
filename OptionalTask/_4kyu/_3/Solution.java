package OptionalTask._4kyu._3;

class Solution {
    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 36, 19, 20}));
    }

    public static String rangeExtraction(int[] arr) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
            int start = i;
            while (start < arr.length - 1 && arr[start] + 1 == arr[start + 1])
                start++;
            if (i + 1 < start) {
                i = start;
                answer.append("-");
                answer.append(arr[i]);
            }
            answer.append(",");
        }
        return answer.substring(0, answer.length() - 1);
    }
}