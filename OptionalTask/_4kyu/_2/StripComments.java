package OptionalTask._4kyu._2;

import java.util.Arrays;

/**
 * Complete the solution so that it strips all text that follows any of a set of comment markers passed in.
 * <p>Any whitespace at the end of the line should also be stripped out.
 */
public class StripComments {
    public static void main(String[] args) {
        var check = stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"});
        System.out.println(check);
    }

    public static String stripComments(String text, String[] commentSymbols) {
        String[] str = text.split("\n");
        String symb = Arrays.toString(commentSymbols).replaceAll("[ ,]", "");
        String regex = "[ ]*(" + symb + ".*)?$";
        //System.out.println(regex);
        String answer = "";
        for (var now : str) {
            answer += now.replaceAll(regex, "") + "\n";
        }
        return answer.substring(0, answer.length() - 1);
    }
}