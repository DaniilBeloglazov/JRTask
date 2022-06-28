package com.lvl4tasks.tsk11;

class Dog{
    String name, color;
    int height;
    Dog(String name){
        this.name = name;
        color = "unknown";
        height = 60;
    }
    Dog(String name, int height){
        this.name = name;
        color = "unknown";
        this.height = height;
    }
    Dog(String name, int height, String color){
        this.name = name;
        this.color = color;
        this.height = height;
    }
}
