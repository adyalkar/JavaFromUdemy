package UtlityForInterview;

import java.util.ArrayList;

public class SpecificWordExtractor {
    public static void main(String[] args) {
        String sentence = "This is an example sentence to demonstrate word extraction";
        String[] words = sentence.split(" "); // Split the sentence into an array of words

        ArrayList<String> specificWords = new ArrayList<>();

        for (String word : words) {
            // Check if the word is the one you want to store
            if (word.equalsIgnoreCase("example") || word.equalsIgnoreCase("word")) {
                specificWords.add(word);
            }
        }

        System.out.println("Specific words found: " + specificWords);
    }
}
