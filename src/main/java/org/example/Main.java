package org.example;

public class Main {
    public static void main(String[] args) {
        AllMethods allMethods = new AllMethods();
        allMethods.printThreeWords();
        allMethods.checkSumSign();
        allMethods.printColor();
        allMethods.compareNumbers();
        System.out.println(allMethods.sumFromTenToTwenty(12, 6));
        allMethods.checkPlusOrMinusSign(-3);
        System.out.println(allMethods.checkPlusOrMinusSignBoolean(-6));
        allMethods.printTextSeveralTimes(5, "abc");
        System.out.println(allMethods.isLeapYear(2000));
        allMethods.invertArray();
        allMethods.emptyArray();
        allMethods.multipleOnTwoArray();
        allMethods.fillDiagonal();
        allMethods.printArrayInConsole(allMethods.retLenArr(5, 1));
    }

}
