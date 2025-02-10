package org.example.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC151 {

    // Very improved version using regex, Collections class and String.join
    public String reverseWord(String s) {
        // Trim leading and trailing spaces, and split words by multiple spaces
        String[] words = s.trim().split("\\s+");

        // Convert array to list and reverse it
        List<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, words);
        Collections.reverse(wordList);

        // Join words properly without trailing space
        return String.join(" ", wordList);
    }

    // My original solution
    public String reverseWords(String s) {
        List<String> reverseStrings = new ArrayList<>();

        // Loop through all characters. That way every time we find a letter we know it is a valid beginning of a word until we find the next " ".
        for(int i = 0; i < s.length(); i++) {
            // if FIRST index == " ", we exit
            if(i == 0 && s.charAt(0) == ' ') {
                continue;
            }

            // if LAST index == " ", continue
            if(i == s.length() -1 && s.charAt(s.length() - 1) == ' ') {
                continue;
            } else if (i == s.length() -1 && s.charAt(s.length() - 1) != ' '){
                reverseStrings.add(String.valueOf(s.charAt(i)));
                break;
            }

            // if s.charAt(i) != " "
            if(s.charAt(i) != ' ') {
                StringBuilder word = new StringBuilder();
                word.append(s.charAt(i));

                //check the next i, if next i == " ", add to word
                int c = i + 1;
                while (c < s.length() && s.charAt(c) != ' ') {
                    word.append(s.charAt(c));
                    c++;
                }

                reverseStrings.add(word.toString());

                // set i to skip already processed words
                i = c;
            }
        }
        // reverse order of words
        Collections.reverse(reverseStrings);

        return String.join(" ", reverseStrings);
    }
}
