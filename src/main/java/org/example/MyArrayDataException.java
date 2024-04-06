package org.example;

public class MyArrayDataException extends Exception {

    MyArrayDataException(int i, int j) {
        super(String.format("Неверные данные находятся в ячейке [%d, %d]\n", i, j));
    }
}
