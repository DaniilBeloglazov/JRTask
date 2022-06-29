package com.lvl4tasks.tsk21;

class Circle {

    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this(x, y, 10);
    }

    public Circle() {
        this(5, 5, 1);
    }
    void printData(){
        System.out.print(x + " " + y + " " + radius);
    }
}
