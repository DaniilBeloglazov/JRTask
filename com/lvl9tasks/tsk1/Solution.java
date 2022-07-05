package com.lvl9tasks.tsk1;

class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (long) (a + f / c + b); // 1234.0 / 0
        System.out.println(d);
    }
}
