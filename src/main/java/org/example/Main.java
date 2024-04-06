package org.example;


public class Main {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"3", "7", "3", "1"},
                {"1", "6", "0", "4"},
                {"0", "4", "9", "2"},
                {"5", "2", "7", "8"}
        };
        String[][] wrongSizeMatrix = {
                {"1", "2", "0", "3"},
                {"3", "4", "1", "5"},
                {"9", "6", "7", "4"},
                {"0", "5"}
        };
        String[][] wrongCharMatrix = {
                {"4", "9", "2", "3"},
                {"F", "1", "5", "9"},
                {"2", "8", "7", "6"},
                {"1", "7", "R", "5"}
        };

        try {
            System.out.println("Вариант 1:");
            System.out.println("Сумма всех элементов массива равна " + ConverterAndSum.strConverter(correctMatrix) + ".\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Вариант 2:");
            System.out.println("Сумма всех элементов массива равна " + ConverterAndSum.strConverter(wrongSizeMatrix) + ".\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Вариант 3:");
            System.out.println("Сумма всех элементов массива равна " + ConverterAndSum.strConverter(wrongCharMatrix) + ".\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
