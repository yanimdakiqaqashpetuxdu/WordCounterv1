package com.example.wordcounterv1;

public class Count {

    public int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public int countCharacters(String input) {
        if (input == null) {
            return 0;
        }
        return input.length();
    }
}
