package com.lvl7task.tsk24;

import java.util.ArrayList;

class Human {
    String name;
    boolean sex;
    int age;
    ArrayList<Human> childs = new ArrayList<>();
    Human(String name, boolean sex, int age, ArrayList<Human> childs){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.childs = childs;
    }
    Human(String name, boolean sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String toString() {
        String text = "";
        text += "Имя: " + name;
        text += ", пол: " + (sex ? "мужской" : "женский");
        text += ", возраст: " + age;
        int childsCount = childs.size();
        if (childsCount != 0){
            text += ", дети: ";
            for (var child : childs){
                text += ", " + child;
            }
        }
        return text;
    }
}
