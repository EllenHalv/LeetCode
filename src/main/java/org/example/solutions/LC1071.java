package org.example.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 1071.
 * Greatest Common Divisor of Strings.
 * Author: Ellen Halvardsson
 */
public class LC1071 {
    // My improved version
    public List<Boolean> kidsWithCandy(int[] candies, int extraCandies) {
        // list for the result
        List<Boolean> result = new ArrayList<>();

        // find out the highest number of candies using a for loop
        int max = 0; // value to compare with
        for(int candy : candies) {
            if(candy > max) {
                max = candy;
            }
        }

        // find out which are greatest or equal to the greatest by comparing to the max value
        for(int candy : candies) {
            int total = candy + extraCandies;
            if(total >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

        // My original solution
     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // array for true/false list of who has the greatest number of candies
        List<Boolean> result = new ArrayList<>();

        // check if numbers are valid
        if (valid(candies, extraCandies)) {

            int i; // number to traverse with
            int max = candies[0]; // number to hold the current largest number

            // find the largest number in candies array
            for(i = 1; i < candies.length; i++) {
                if(candies[i] > max) {
                    max = candies[i];
                }
            }

            // compare all kids candies + extra and see if the number is greater than the max number
            int j; // number to traverse with
            for(j = 0; j < candies.length; j++) {
                int total = candies[j] + extraCandies;
                if(total >= max) {
                    //result[i] = true;
                    result.add(true);
                } else {
                    //result[i] = false;
                    result.add(false);
                }
            }

        }

        return result;
    }

    public boolean valid(int[] candies, int extraCandies) {
        if (candies.length < 2 || candies.length > 100) {
            return false;
        }

        for (int candy : candies) {
            if (candy < 1 || candy > 100) {
                return false;
            }
        }

        if (extraCandies < 1 || extraCandies > 50) {
            return false;
        }

        return true;
    }
}

