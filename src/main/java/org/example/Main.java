package org.example;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        sumFromTenToTwenty(12, 77);
        checkPlusOrMinusSign(-3);
        checkPlusOrMinusSignBoolean(6);
        printTextSeveralTimes(5, "abc");
        boolean leapYear = isLeapYear(2000);
        System.out.println(leapYear);
        invertArray();
        emptyArray();
        multipleOnTwoArray();
        fillDiagonal();
        printArrayInConsole(retLenArr(5, 1));
    }

    //1
    public static void  printThreeWords() {
        System.out.println("Orange \n" + "Banana \n" +  "Apple");
    }

    //2
    public static void checkSumSign() {
        int a = -6;
        int b = 4;
        if(a + b > 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    //3
    public static void printColor() {
        int value = 45;
        if(value <= 0) {
            System.out.println("Красный");
        }
        else if (value <=100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    //4
    public static void compareNumbers() {
        int a = 6;
        int b = 4;
        if(a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    //5
    public static void sumFromTenToTwenty(int a, int b) {
        if(a + b >= 10 && a + b <= 20) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    //6
    public static void checkPlusOrMinusSign(int a) {
        if(a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    //7
    public static void checkPlusOrMinusSignBoolean(int a) {
        if(a >= 0) {
            System.out.println(false);
        }
        else {
            System.out.println(true);
        }
    }

    //8
    public static void printTextSeveralTimes(int length, String str) {
        for(int i = 0; i < length; i++) {
            System.out.println(str);
        }
    }

    //9
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 || year % 400 == 0 || year % 100 != 0);
    }

    //10
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //11
    public static void emptyArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //12
    public static void multipleOnTwoArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //13
    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //14
    public static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}
