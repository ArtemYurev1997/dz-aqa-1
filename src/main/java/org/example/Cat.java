package org.example;

public class Cat extends Animal {
    private String fullname;
    private int appetite;
    private boolean isSatiety;
    private static int count;
    public Cat(String type, String name, int swims, int run) {
        super(type, name, swims, run);
        count++;
    }

    public Cat(String fullname, int appetite, boolean isSatiety) {
        this.fullname = fullname;
        this.appetite = appetite;
        this.isSatiety = isSatiety;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return isSatiety;
    }

    public void setSatiety(boolean isSatiety) {
        this.isSatiety = isSatiety;
    }

    public static int getCount() {
        return count;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}
