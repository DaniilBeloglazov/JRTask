package JavaRush.lvl4tasks.tsk18;

class Dog {
    private String name, color;
    private int height;
    Dog(String name){
        this.name = name;
    }
    Dog(String name, int height){
        this.name = name;
        this.height = height;
    }
    Dog(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
    void printData(){
        System.out.print(name + " " + height + " " + color);
    }
}
