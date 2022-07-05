package com.lvl8tasks.tsk25;

class Solution {
    static int A = 5;
    static int B = 2 * A;
    int C = A * B;
    static int D = A * B;

    public static void main(String[] args) {
        Solution room = new Solution();
        room.A = 5;
        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}
