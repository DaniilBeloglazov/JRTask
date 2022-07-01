package com.lvl6tasks.tsk26;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public final static ArrayList<Cat> CATS = new ArrayList<Cat>();
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        while (!name.isEmpty()) {
            Cat cat = new Cat(name, reader.nextInt(), reader.nextInt(), reader.nextInt());
            reader.nextLine();
            CATS.add(cat);
            name = reader.nextLine();
        }
        printList();
    }
    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }
    static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
        }
    }
}
