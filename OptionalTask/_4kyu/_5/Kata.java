package OptionalTask._4kyu._5;

import java.util.*;
import java.util.stream.Collectors;

import java.util.Arrays;

public class Kata {
    public static long nextBiggerNumber(long n) {
        char[] digits = String.valueOf(n).toCharArray();
        for (int i = digits.length - 2; i >= 0; i--) {
            long check = getMinOfLastThatBigger(i, digits);
            if (check != -1)
                return check;
        }
        return -1;
    }
    static long getMinOfLastThatBigger(int i, char[] digits){
        for (int j = digits.length - 1; j > i; j--){
            if (digits[i] < digits[j]){ // if true we swap digits
                char tmp = digits[i];
                digits[i] = digits[j];
                digits[j] = tmp;
                Arrays.sort(digits, i + 1, digits.length);
                return Long.parseLong(String.valueOf(digits));
            }
        }
        return -1;
    }
}