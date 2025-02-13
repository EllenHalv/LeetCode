package org.example.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 412.
 * FizzBuzz.
 * Author: Ellen Halvardsson.
 */
public class LC412 {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if(i % 3 == 0) {
                answer.add("Fizz");
            } else if(i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}
