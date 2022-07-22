package JavaRush.lvl4tasks.tsk24;

class Circle {
    private double x;
    private double y;
    private double r;
    Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    void pirntData(){
        System.out.print(x + " " + y + " " + r);
    }
}
