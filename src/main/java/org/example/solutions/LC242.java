package org.example.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * LC 242
 * Valid Anagram
 * Author: Ellen Halvardsson.
 */
public class LC242 {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        } else {
            Map<Character, Integer> sMap = new HashMap<>();
            Map<Character, Integer> tMap = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);

                if (sMap.containsKey(sChar)) {
                    sMap.put(sChar, sMap.get(sChar) + 1);
                } else {
                    sMap.put(sChar, 1);
                }

                if (tMap.containsKey(tChar)) {
                    tMap.put(tChar, tMap.get(tChar) + 1);
                } else {
                    tMap.put(tChar, 1);
                }
            }

            if(sMap.equals(tMap)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
