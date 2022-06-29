package com.lvl5tasks.tsk8;

class Cat {
    private static int catCount;
    public Cat(){
        catCount++;
    }
    static int getCatCount(){
        return catCount;
    }
    static void setCatCount(int numOfCats){
        catCount = numOfCats;
    }
}
