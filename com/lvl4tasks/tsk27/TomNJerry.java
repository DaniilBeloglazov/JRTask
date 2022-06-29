package com.lvl4tasks.tsk27;

class TomNJerry {
    static class Dog{
        String name;
        double height;
        double power;
        Dog(String name, double height, double power){
            this.name = name;
            this.height = height;
            this.power = power;
        }
        @Override
        public String toString(){
            return name + " " + height + " " + power;
        }
    }
    static class Cat{
        String name;
        double height;
        double power;
        Cat(String name, double height, double power){
            this.name = name;
            this.height = height;
            this.power = power;;
        }
        @Override
        public String toString(){
            return name + " " + height + " " + power;
        }
    }
    static class Mouse{
        String name;
        double height;
        double power;
        Mouse(String name, double height, double power){
            this.name = name;
            this.height = height;
            this.power = power;
        }
        @Override
        public String toString(){
            return name + " " + height + " " + power;
        }
    }
}
