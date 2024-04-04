package org.example;

public class Animal {
    private String type;
    private String name;
    private int swims;
    private int runs;
    private static int count;

    public Animal(String type, String name, int swims, int runs) {
        this.type = type;
        this.name = name;
        this.swims = swims;
        this.runs = runs;
        count++;
    }

    public Animal() {
        count++;
    }


    public static int getCount() {
        return count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSwims() {
        return swims;
    }

    public void setSwims(int swims) {
        this.swims = swims;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void run(int distance) {
        String result = (runs <= distance) ? getType() + " с именем " + getName() + " успешно пробежал(а) " + getRuns() + "м." : getType() + " с именем " + getName() + " не может пробежать больше";
        System.out.println(result);
    }

    public void swim(int distance) {
        String result = (swims <= distance) ? getType() + " с именем " + getName() + " успешно проплыл(а) " + getSwims() + "м." : getType() + " с именем " + getName() + " не может проплыть больше";
        System.out.println(result);
    }
}

