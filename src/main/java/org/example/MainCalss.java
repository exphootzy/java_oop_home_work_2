package org.example;

import java.util.Arrays;
public class MainCalss {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Fima", 7, false),
                new Cat("Rijik", 25, false),
                new Cat("Beliy", 0, true),
                new Cat("Barsik", 10, false),
        };

        Plate plate = new Plate(30);

        for (Cat kitty : cats) {

            if (kitty.getAppetite() == 0) {
                System.out.printf("\n%s not hungry", kitty.name);
            }
            else if (plate.getFood() >= kitty.getAppetite()) {
                kitty.eat();
                System.out.printf("\n%s is meal", kitty.name);
                plate.setFood(plate.getFood() - kitty.getAppetite());
                kitty.setAppetite(0);
                kitty.full = true;
            }

            else if (kitty.getAppetite() > 0 && plate.getFood() < kitty.getAppetite()) {
                System.out.printf("\nThere is no enough food for %s", kitty.name);
            }
        }
        plate.addFood(plate.getFood());
    }
}
