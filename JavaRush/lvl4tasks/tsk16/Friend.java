package JavaRush.lvl4tasks.tsk16;

class Friend {
    String name;
    int age;
    char sex;
    Friend(String name){
        this.name = name;
    }
    Friend(String name, int age){
        this.name = name;
        this.age = age;
    }
    Friend(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
