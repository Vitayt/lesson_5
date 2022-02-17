package Task_2;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {

        Box<Apple> boxApple = new Box();
        Box<Orange> boxOrange = new Box();
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        // boxApple.addFruit(new Apple());

        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());

        System.out.println("boxApple.getBoxWeight() = " + boxApple.getBoxWeight());
        System.out.println("boxOrange.getBoxWeight() = " + boxOrange.getBoxWeight());

        System.out.println("boxApple.compare(boxOrange) = " + boxApple.compare(boxOrange));
        Box<Apple> boxApple2 = new Box();
        boxApple.moveBox(boxApple2);
        // boxApple2.moveBox(boxApple);
        System.out.println("boxApple2.getBoxWeight() = " + boxApple2.getBoxWeight());
        Box<Orange> boxOrange2 = new Box<>();
      boxOrange.moveBox(boxOrange2);
        System.out.println("boxApple.compare(boxOrange) = " + boxApple.compare(boxOrange2));



    }

}


