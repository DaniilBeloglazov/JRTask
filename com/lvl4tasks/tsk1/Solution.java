package com.lvl4tasks.tsk1;
public class Solution {
    public static void main() {
        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(30);
        System.out.println("Adjusted Age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            int inadjustAge = this.age;
            this.age += age;
            System.out.println("The Age in adjustAge() is " + inadjustAge);
        }
    }
}