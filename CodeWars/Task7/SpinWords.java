package CodeWars.Task7;

public class SpinWords {
    public static void main(String[] args) {
        System.out.print(spinWords("Hey wollef sroirraw"));
    }
    public static String spinWords(String sentence) {
        String[] strings = sentence.split("\\b");
        String out = "";
        for (String str : strings){
            if (str.length() >=5 ){
                StringBuilder builder = new StringBuilder(str);
                str = builder.reverse().toString();
            }
            out += str;
        }
        return out;
    }
}
