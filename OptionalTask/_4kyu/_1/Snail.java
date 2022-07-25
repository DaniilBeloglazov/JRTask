package OptionalTask._4kyu._1;

import java.util.*;

/**
 * Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.
 */
class Snail {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[][]{{}}));
    }
    static int[] snail(int[][] array) {
        if (Arrays.deepEquals(array, new int[][]{{}})){
            return new int[]{};
        }
        int id = 0;
        int sizeAr = array.length * array.length;
        ArrayList<Integer> answ = new ArrayList<>();
        while (answ.size() < sizeAr) {
            for (int j = id; j < array.length - id; j++) { // j = 1; i < 2
                answ.add(array[id][j]);
            }
            for (int i = id + 1; i < array.length - id; i++) {
                answ.add(array[i][array.length - id - 1]);
            }
            id++;
            for (int j = array.length - id - 1; j >= id - 1; j--) {
                answ.add(array[array.length - id][j]);
            }
            for (int i = array.length - id - 1; i >= id; i--) {
                answ.add(array[i][id - 1]);
            }
        }
        return answ.stream().mapToInt(Integer::intValue).toArray();
    }
}
