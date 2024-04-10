package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private final HashMap<String, List<String>> phoneNumbers;

    public PhoneBook() {
        phoneNumbers = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if(phoneNumbers.containsKey(lastName)) {
            phoneNumbers.get(lastName).add(phoneNumber);
        }
        else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneNumbers.put(lastName, numbers);
        }
    }

    public List<String> get(String lastName) {
        return phoneNumbers.get(lastName);
    }

}
