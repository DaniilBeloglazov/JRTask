package com.lvl4tasks.tsk9;

class Friend {
    String name;
    char sex;
    int age;
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
