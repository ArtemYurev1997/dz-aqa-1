package org.example;

public class AllMethods {
    //1
    public  void  printThreeWords() {
        System.out.println("Orange \n" + "Banana \n" +  "Apple");
    }

    //2
    public void checkSumSign() {
        int a = -6;
        int b = 4;
        String s = (a + b > 0) ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(s);
    }

    //3
    public void printColor() {
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
    public void compareNumbers() {
        int a = 6;
        int b = 4;
        String s = (a >= b) ? "a >= b" :"a < b";
        System.out.println(s);
    }

    //5
    public boolean sumFromTenToTwenty(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    //6
    public void checkPlusOrMinusSign(int a) {
        String s = (a >= 0) ? "Число положительное" : "Число отрицательное";
        System.out.println(s);
    }

    //7
    public boolean checkPlusOrMinusSignBoolean(int a) {
       return a >= 0;
    }

    //8
    public void printTextSeveralTimes(int length, String str) {
        for(int i = 0; i < length; i++) {
            System.out.println(str);
        }
    }

    //9
    public  boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //10
    public void invertArray() {
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
    public void emptyArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //12
    public void multipleOnTwoArray() {
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
    public void fillDiagonal() {
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
    public int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    public void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}
