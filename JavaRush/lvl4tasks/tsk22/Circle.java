package JavaRush.lvl4tasks.tsk22;

class Circle {
    private double x;
    private double y;
    private double radius;

    Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    Circle(double x, double y) {
        this(x, y, 10);
    }

    Circle(double x) {
        this(x, 0, 10);
    }

    Circle() {
        this(5, 5, 10);
    }
    void printData(){
        System.out.print(x + " " + y + " " + radius);
    }
}
