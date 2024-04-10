package org.example;


import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] values = {"apple", "orange", "banana", "berry", "banana", "apple", "cherry", "lemon", "grape"};
        UniqueWordsAndCount.countAllWords(values);
        UniqueWordsAndCount.uniqueWords(values);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Antonov", "+375298881122");
        phoneBook.add("Ivanov", "+375299096743");
        phoneBook.add("Borisov", "+375293654412");
        phoneBook.add("Antonov", "+375297123456");

        System.out.println("Ivanov:");
        List<String> ivanovNumbers = phoneBook.get("Ivanov");
        for(String number: ivanovNumbers) {
            System.out.println(number);
        }

        System.out.println("Antonov:");
        List<String> antonovNumbers = phoneBook.get("Antonov");
        for(String number: antonovNumbers) {
            System.out.println(number);
        }

        System.out.println(phoneBook.allNumbersAntonov());
    }
}
