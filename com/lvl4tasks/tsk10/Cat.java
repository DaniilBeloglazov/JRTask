package com.lvl4tasks.tsk10;

class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    Cat (String name) {
        this.name = name;
        weight = 2;
        age = 5;
        color = "white";
    }

    Cat (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "white";
    }

    Cat(String name, int age) {
        this.name = name;
        this.weight = 5;
        this.age = age;
        color = "white";
    }

    Cat (int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 5;
    }

    Cat (int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.age = 5;
        this.address = address;
    }
}
