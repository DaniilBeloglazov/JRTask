package JavaRush.lvl4tasks.tsk17;

class Cat {
    private String name, address, color;
    private int age, weight;
    Cat(String name) {
        this.name = name;
        weight = 20;
        age = 4;
        color = "white";
    }
    Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "white";
    }
    Cat(String name, int age){
        this.name = name;
        weight = 20;
        this.age = age;
        color = "white";
    }
    Cat(int weight, String color){
        this.weight = weight;
        age = 4;
        this.color = color;
    }
    Cat(int weight, String color, String address){
        this.weight = 20;
        age = 4;
        this.color = color;
        this.address = address;
    }
    void printData(){
        System.out.print(name + " " + age + " " + weight + " " + color + " " + address);
    }
}
