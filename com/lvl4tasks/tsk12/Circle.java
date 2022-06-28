package com.lvl4tasks.tsk12;

class Circle{
    int x, y, radius, width;
    String color;
    Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    Circle(int x, int y, int radius, int width){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.width = width;
    }
    Circle(int x, int y, int radius, int width, String color){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
