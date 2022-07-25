package OptionalTask._4kyu._2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Complete the solution so that it strips all text that follows any of a set of comment markers passed in.
 * <p>Any whitespace at the end of the line should also be stripped out.
 */
public class StripComments {
    public static void main(String[] args) {
        var check = stripComments("a #b\nc\nd $e f g", new String[] { "#", "$" });
        System.out.println(check);
    }
    public static String stripComments(String text, String[] commentSymbols) {
        String regex = "(";
        String checkSymb = "?.*^$+-";
        for (var now : commentSymbols){
            if (!checkSymb.contains(now))
                regex += now + "|";
            else
                regex += "\\" + now + "|";
        }
        regex = regex.substring(0, regex.length() - 1) + ")" + ".+?(\\n|$)";
        // System.out.println(regex);
        String[] answer = text.split(regex);
        String check = "";
        for (int i = 0; i < answer.length - 1; i++){
            check += answer[i].trim() + "\n";
        }
        check += answer[answer.length - 1].trim();
        return check; // "apples, pears\ngrapes\nbananas"
    }
}