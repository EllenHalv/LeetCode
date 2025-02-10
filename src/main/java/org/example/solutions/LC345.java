package org.example.solutions;

import java.util.*;

/**
 * LeetCode 345.
 * Reverse Vowels of a String.
 * Author: Ellen Halvardsson
 */

public class LC345 {
    public String reverseVowels(String s) {
        // make a linked hash map for all vowels found
        // key is its position in 's' orignal String, value is the character
        Map<Integer, String> vowels = new LinkedHashMap<>();

        // find all vowels using a loop, charAt(i) == 'e'
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowels.put(i, String.valueOf(c));
            }
        }
        // then make a version of the list where the value of the keys are reversed
        // add all values in order to a arraylist
        List<String> values = new ArrayList<>(vowels.values());

        // reverse the order
        Collections.reverse(values);

        // create a stringbuilder to modify
        StringBuilder sb = new StringBuilder(s);

        // replace them one by one in the linkedhashmap
        // first in the list gets put in first in map
        int index = 0;
        for (Integer pos : vowels.keySet()) {
            // values.get(index) är en sträng med ett tecken, så vi hämtar tecknet med charAt(0)
            sb.setCharAt(pos, values.get(index).charAt(0));
            index++;
        }

        return sb.toString();
    }
}
