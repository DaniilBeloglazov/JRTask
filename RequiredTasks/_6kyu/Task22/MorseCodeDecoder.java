package RequiredTasks._6kyu.Task22;

import java.util.HashMap;

public class MorseCodeDecoder {
    static HashMap<String, String> MorseCode = new HashMap<>(){{
        put(".-", "a");
        put("-...", "b");
        put("-.-.", "c");
        put("-..", "d");
        put(".", "e");
        put("..-.", "f");
        put("--.", "g");
        put("....", "h");
        put("..", "i");
        put(".---", "j");
        put("-.-", "k");
        put(".-..", "l");
        put("--", "m");
        put("-.", "n");
        put("---", "o");
        put(".--.", "p");
        put("--.-", "q");
        put(".-.", "r");
        put("...", "s");
        put("-", "t");
        put("..-", "u");
        put("...-", "v");
        put(".--", "w");
        put("-..-", "x");
        put("-.--", "y");
        put("--..", "z");
    }};
    public static void main(String[] args) {
        System.out.println (decode("   .   .   "));
    }
    public static String decode(String morseCode) {
        String result = "";
        for(String word : morseCode.trim().split(" {3}")) {
            for(String letter : word.split(" ")) {
                result += MorseCode.get(letter);
            }
            result += " ";
        }
        return result.trim();
    }
}