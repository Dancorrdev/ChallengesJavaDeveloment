package com.dancorrdev;

import java.util.Locale;

public class Challenge02Anagrama {

    public static Boolean isAnAnagram(String wordNumberOne, String wordNumberTwo) {
        if (wordNumberOne.equals(wordNumberTwo)) {
            return true;
        } else {
            return true;
        }
    }

    public static String invertWord(String wordTwo) {
        return new StringBuilder(wordTwo).reverse().toString();
    }

    public static void main(String[] args) {
        String firstWord = "amor";
        String secondWord = "roma";
        String invertedSecondWord = invertWord(secondWord);
        if (firstWord.length() == secondWord.length()) {
            System.out.println(isAnAnagram(firstWord, invertedSecondWord));
        }
    }
}
