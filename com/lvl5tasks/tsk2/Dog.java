package com.lvl5tasks.tsk2;

class Dog {
    static int dogCount;
    {dogCount++;}
    protected void finalize() throws Throwable {
        dogCount -= 1;
        System.out.println("Dog was destroyed");
    }
}
