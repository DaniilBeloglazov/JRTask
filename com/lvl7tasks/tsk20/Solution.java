package com.lvl7tasks.tsk20;

import java.util.HashSet;
import java.util.Set;

class Solution {
    static class Cat{}
    static class Dog{}
    static Set<Cat> createCats(){
        HashSet<Cat> set = new HashSet<>() {{
            add(new Cat());
            add(new Cat());
            add(new Cat());
            add(new Cat());
        }};
        return set;
    }
    static Set<Dog> createDogs(){
        HashSet<Dog> set = new HashSet<>() {{
            add(new Dog());
            add(new Dog());
            add(new Dog());
        }};
        return set;
    }
    static  Set<Object> join(Set<Cat> cats, Set<Dog> dogs){
        Set<Object> set = new HashSet<>(cats);
        set.addAll(dogs);
        return set;
    }
    static Set<Object> removeCats(Set<Object> pets, Set<Cat> cats){
        cats.forEach(pets::remove);
        return pets;
    }
    static void printPets(Set<Object> pets){
        pets.forEach(System.out::println);
    }
}
