package com.lvl5tasks.tsk5;

class Body {
    double height, weight;
    Body(double weight, double height){
        this.height = height;
        this.weight = weight;
    }
    void printBMI(){
       double res = weight / (height * height);
       if (res < 18.5)
           System.out.print("Недовес, меньше чем 18.5");
       else if (res <= 24.9)
           System.out.print("Нормальный между 18.5 и 24.9");
       else if (res <= 29.9)
           System.out.print("Избыточный вес: между 25 и 29.9");
       else
           System.out.print("Ожирение: 30 или больше");
    }
}
