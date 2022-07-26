package OptionalTask._4kyu._4;

import java.util.ArrayList;
import java.util.List;

class Permutations {
    public static void main(String[] args) {
        for (var now : singlePermutations("aabb")) {
            System.out.println(now);
        }
    }

    public static List<String> singlePermutations(String s) {
        List<String> answer = new ArrayList<>();
        permute(s.length(), s, "", answer);
        return answer;
    }

    public static void permute(int n, String inp, String currentWord, List<String> answer) {
        if (n == 0) {
            if (!answer.contains(currentWord))
                answer.add(currentWord);
        } else {
            for (int i = 0; i < inp.length(); i++) {
                String sub = inp.substring(i, i + 1);
                permute(n - 1, inp.replaceFirst(sub, ""), currentWord + sub, answer);
            }
        }
    }
}