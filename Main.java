package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    // Function to check if given sentence is pangram
    public static boolean checkIfPangram(String sentence) {
        // Create a set to store unique characters
        Set<Character> alpha = new HashSet<>();
        // Iterate over each character using a normal for loop
        for (int  i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                // Convert the current character to lowercase
                // Add the character to the set
                alpha.add(Character.toLowerCase(sentence.charAt(i)));
            }
        }

        // Return true if set size is 26 (total number of alphabets)
        if (alpha.size() == 26) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Test case 1: "TheQuickBrownFoxJumpsOverTheLazyDog"
        // Expected output: true
        System.out.println(checkIfPangram("TheQuickBrownFoxJumpsOverTheLazyDog"));

        // Test case 2: "This is not a pangram"
        // Expected output: false
        System.out.println(checkIfPangram("This is not a pangram"));

        // Test case 3: "abcdef ghijkl mnopqr stuvwxyz"
        // Expected output: true
        System.out.println(checkIfPangram("abcdef ghijkl mnopqr stuvwxyz"));

        // Test case 4: ""
        // Expected output: false
        System.out.println(checkIfPangram(""));

        // Test case 5: "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        // Expected output: true
        System.out.println(checkIfPangram("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
}
