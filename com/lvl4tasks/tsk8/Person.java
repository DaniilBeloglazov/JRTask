package com.lvl4tasks.tsk8;

class Person{
    private String name;
    private int age;
    private char sex;
    String getName(){
        return (this.name);
    }
    int getAge(){
        return (this.age);
    }
    char getSex(){
        return (this.sex);
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setSex(char sex){
        this.sex = sex;
    }
}
