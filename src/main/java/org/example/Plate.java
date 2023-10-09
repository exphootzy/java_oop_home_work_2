package org.example;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int food) {
        if (food < 30) {
            System.out.println("\nFeed your cats!!!");
        }
        else System.out.println("\nFood is enough...");
    }
}
