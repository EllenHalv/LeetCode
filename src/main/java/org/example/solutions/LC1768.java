package org.example.solutions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * LeetCode 1768
 * Merge Strings Alternately
 * Author: Ellen Halvardsson
 */

public class LC1768 {
    // My improved version
    public String mergeAlt(String word1, String word2) {
        // define the merged String using Stringbuilder
        StringBuilder mergedString = new StringBuilder();

        // loop that iterates over the characters
        int i = 0; // value to compare with
        while(word1.length() > i || word2.length() > i) {
            if(word1.length() > i) {
                mergedString.append(word1.charAt(i));
            }
            if(word2.length() > i) {
                mergedString.append(word2.charAt(i));
            }
            i++;
        }

        // return the merged String
        return mergedString.toString();
    }

    // My first solution
    public String mergeAlternately(String word1, String word2) {
        // seperate into individual characters
        ArrayList<String> w1List = new ArrayList<>(Arrays.asList(word1.split("")));
        ArrayList<String> w2List = new ArrayList<>(Arrays.asList(word2.split("")));

        // the merge ArrayList
        ArrayList<String> mergeString = new ArrayList<>();

        // merge the characters alternately
        do {
            // add first char of word1
            mergeString.add(w1List.get(0));
            // remove first char of word1
            w1List.remove(0);

            // add first char of word2
            mergeString.add(w2List.get(0));
            // remove first char of word2
            w2List.remove(0);
        }
        while (w1List.size() > 0 && w2List.size() > 0);

        // check if each list is > 0
        // if > 0 add all remaining chars to the mergeString

        if (w1List.size() > 0) {
            // for loop for all remainging chars
            for (String s : w1List) {
                mergeString.add(s);
            }
        }

        if (w2List.size() > 0) {
            // for loop for all remainging chars
            for (String s : w2List) {
                mergeString.add(s);
            }
        }

        // return the result as a String
        return String.join("", mergeString);
    }
}

