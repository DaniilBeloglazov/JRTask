package RequiredTasks._7kyu.Task15;

public class DnaStrand {
  public static String makeComplement(String dna) {
    String[] str = dna.split("");
    for (int i = 0; i < str.length; i++){
      switch (str[i]){
        case "A":
          str[i] = "T";
          break;
        case "T":
          str[i] = "A";
          break;
        case "C":
          str[i] = "G";
          break;
        case "G":
          str[i] = "C";
          break;
      }
    }
    return String.join("", str);
  }
}