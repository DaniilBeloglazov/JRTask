package com.lvl6tasks.tsk23;

public class Solution {
    static void boom() throws InterruptedException {
        for (int i = 30; i >= 0; i--){
            System.out.print(i + " ");
            Thread.sleep(100);
        }
        System.out.print("Boom");
    }
}
