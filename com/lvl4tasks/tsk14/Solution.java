package com.lvl4tasks.tsk14;
class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Andrew", 22);
    }
    static class Person {
        String name;
        int age;
        void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}