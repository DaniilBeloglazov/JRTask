package JavaRush.lvl6tasks.tsk24;

class Human {
    String name;
    boolean sex;
    // true -wm
    int age;
    Human dad;
    Human mom;
    Human(String name, boolean sex, int age, Human dad, Human mom) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.dad = dad;
        this.mom = mom;
    }
    Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    @Override
    public String toString(){
        String out = name + " " + sex + " " + age;
        if (dad != null)
            out += " Отец: " + dad.name;
        if (mom != null)
            out += " Мать: " + mom.name;
        return out;
    }
}
