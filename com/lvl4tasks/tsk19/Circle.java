package com.lvl4tasks.tsk19;

class Circle {
    private int centerX, centerY, radius, width;
    private String color;
    Circle(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    Circle(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    Circle(int centerX, int centerY, int radius, int width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
    void printData(){
        System.out.print(centerX + " " + centerY + " " + radius + " " + width + " " + color);
    }
}
