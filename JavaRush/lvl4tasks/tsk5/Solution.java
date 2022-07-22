package JavaRush.lvl4tasks.tsk5;
public class Solution {
    Cat cat1 = new Cat("asd",12,4);
    Cat cat2 = new Cat("vfg",23,23);
    Cat cat3 = new Cat("zxc",45,21);
    static class Cat{
        String name;
        int age, strength;
        Cat(String name, int strength, int age){
            this.name = name;
            this.strength = strength;
            this.age = age;
        }
        boolean fight(Cat anotherCat){
            if (anotherCat.strength < strength)
                return true;
            else
                return false;
        }
    }
}
