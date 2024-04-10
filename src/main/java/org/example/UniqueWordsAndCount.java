package org.example;

import java.util.*;

public class UniqueWordsAndCount {
    public static void countAllWords(String[] values) {
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word: values) {
            if(wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            }
            else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Количество слов в массиве:");
        for(String word: wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }

    public static void uniqueWords(String[] values) {
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(values));
        System.out.println(uniqueWords);
    }
}
