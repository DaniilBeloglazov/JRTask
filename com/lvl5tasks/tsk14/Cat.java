package com.lvl5tasks.tsk14;

import java.util.ArrayList;

class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();
    public static void printCats(){
        for(Cat cat : cats){
            System.out.println(cat);
        }
    }
    @Override
    public String toString() {
        return "Cat";
    }
}
