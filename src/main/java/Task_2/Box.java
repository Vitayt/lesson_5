package Task_2;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> fruits = new ArrayList<>();

    void addFruit(T fruit) {
        fruits.add(fruit);
    }

    float getBoxWeight() {
        float weight = 0;
        for (Fruit fruit : fruits) {
            weight += fruit.getWeightFruit();

        }
        return weight;
    }

    boolean compare(Box<?> box) {
        return box.getBoxWeight() == this.getBoxWeight();
    }

    void moveBox(Box<T> box) {
        box.fruits.addAll(fruits);
        fruits.clear();
    }
}