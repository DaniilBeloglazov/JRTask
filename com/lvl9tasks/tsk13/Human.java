package com.lvl9tasks.tsk13;

class Human {
    String name;
    int age;
    Boolean sex;
    int countOfChilds;
    Boolean work;
    int salary;
    Human(String name){
        this.name = name;
    }
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    Human(String name, int age, boolean sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    Human(String name, int age, boolean sex, int countOfChilds){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.countOfChilds = countOfChilds;
    }
    Human(String name, int age, boolean sex, int countOfChilds, boolean work){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.countOfChilds = countOfChilds;
        this.work = work;
    }
    Human(String name, int age, boolean sex, int countOfChilds, boolean work, int salary){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.countOfChilds = countOfChilds;
        this.work = work;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "name: " + name +
                "\nage: " + age +
                "\nsex " + sex +
                "\ncountOfChilds: " + countOfChilds +
                "\nwork: " + work +
                "\nsalary: " + ((salary == 0)? "unknown" : salary);
    }
}
