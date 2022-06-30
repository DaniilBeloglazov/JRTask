package com.lvl5tasks.tsk20;

import java.io.IOException;
import java.util.Scanner;

class Solution {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        Scanner cons = new Scanner(System.in);

        String max = "Max is ";
        int a = Integer.parseInt(cons.nextLine());
        int b = Integer.parseInt(cons.nextLine());
        Solution.max = a > b ? a : b;

        System.out.println(max + Solution.max);
    }
}
