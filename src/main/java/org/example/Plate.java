package org.example;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int x) {
        food -= x;
    }
    public void increaseFood(int x) {
        food += x;
    }
    public void info() {
        System.out.println("Всего еды: " + food);
    }
}
