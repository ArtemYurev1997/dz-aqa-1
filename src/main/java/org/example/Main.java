package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Animal cat1 = new Cat("Кот", "Василий", 3, 130);
        Animal cat2 = new Cat("Кот", "Вискас", 0, 140);
        Animal dog1 = new Dog("Собака", "Гриша", 9, 600);
        Animal dog2 = new Dog("Собака", "Сеня", 11, 200);
        cat1.run(200);
        dog1.run(500);
        cat1.swim(0);
        dog1.swim(10);
        cat2.run(200);
        dog2.run(500);
        cat2.swim(0);
        dog2.swim(10);
        System.out.println(Animal.getCount());
        System.out.println(Dog.getCount());
        System.out.println(Cat.getCount());

        Triangle triangle = new Triangle(10, 15, 20);
        org.example.Rectangle rectangle = new org.example.Rectangle(5, 5);
        Circle circle = new Circle(20);
        circle.setFillColor("Черный");
        circle.setBorderColor("Желтый");
        circle.printCharacteristics();
        rectangle.setFillColor("Черный");
        rectangle.setBorderColor("Желтый");
        rectangle.printCharacteristics();
        triangle.setFillColor("Черный");
        triangle.setBorderColor("Желтый");
        triangle.printCharacteristics();

        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Барсик", 5, false);
        allCats[1] = new Cat("Снежок", 30, false);
        allCats[2] = new Cat("Мурзик", 20, false);
        allCats[3] = new Cat("Чернышка", 45, false);

        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (!allCats[i].isSatiety() && allCats[i].getAppetite() < plate.getFood()){
                allCats[i].eat(plate);
                allCats[i].setSatiety(true);
                System.out.println("Котик " + allCats[i].getFullname() + " покушал!");
            } else {
                System.out.println("Котик " + allCats[i].getFullname() + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм вискаса добавить еще в миску?");
        int action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}
