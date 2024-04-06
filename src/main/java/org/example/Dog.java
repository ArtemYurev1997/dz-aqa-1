package org.example;

public class Dog extends Animal {
    private static int count;

    public Dog(String type, String name, int swims, int run) {
        super(type, name, swims, run);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
