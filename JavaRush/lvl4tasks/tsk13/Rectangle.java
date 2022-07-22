package JavaRush.lvl4tasks.tsk13;

class Rectangle {
    static int top, left, width, height;
    Rectangle(Rectangle rectangle) {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    Rectangle(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    Rectangle(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
}
