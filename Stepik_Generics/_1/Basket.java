package Stepik_Generics._1;

import java.util.ArrayList;
import java.util.List;

public class Basket<U extends Fruit> {
    private List<U> fruits;

    public Basket() {
        fruits = new ArrayList<>();
    }

    public double getWeight() {
        return fruits.stream().mapToDouble(Fruit::getWeight).sum();
    }

    public void add(U fruit){
        fruits.add(fruit);
    }
    public int compare(Basket<?> basket2) {
        return Double.compare(this.getWeight(), basket2.getWeight());
    }

    public static <U extends Fruit> void transfer(Basket<? extends U> src, Basket<? super U> dst) {
        dst.fruits.addAll(src.fruits);
        src.fruits.clear();
    }
}
