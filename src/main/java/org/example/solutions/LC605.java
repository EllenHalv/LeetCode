package org.example.solutions;

import java.util.Arrays;

public class LC605 {
    // My improved version
    public boolean canPlaceFlower(int[] flowerbed, int n) {
        // variable that counts how many flowers can be planted
        int flowerCount = 0;
        int length = flowerbed.length;

        if (length >= 3) {
            // Loop through the flowerbed checking boundaries separately
            for (int i = 0; i < length; i++) {
                // Special check for the first element
                if (i == 0) {
                    if (flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                        flowerbed[i] = 1;
                        flowerCount++;
                    }
                }
                // Special check for the last element
                else if (i == length - 1) {
                    if (flowerbed[i-1] == 0 && flowerbed[i] == 0) {
                        flowerbed[i] = 1;
                        flowerCount++;
                    }
                }
                // For elements in the middle
                else {
                    if (flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                        flowerbed[i] = 1;
                        flowerCount++;
                    }
                }
            }
        } else if (length == 2) {
            // For a flowerbed of length 2, check if both spots are empty.
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerCount++;  // Only one flower can be planted safely.
            }
        } else { // length == 1
            // Only one spot available.
            if (flowerbed[0] == 0) {
                flowerCount++;
            }
        }

        // if 'n' is less than or equal to flowerCount, return true, else false
        return flowerCount >= n;
    }







    // My origial solution
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // n is always = or smaller than flowerbed.length
        // flowerbed.length is always = or larger than 1, and = or smaller than 20.000

        // first, check the array-length
        int length = flowerbed.length;
        // comparisan value
        int num = 1;
        // variable that checks how many 0 in a row loop has found
        int count = 0;
        // variable that counts how many flowers can be planted
        int flowerCount = 0;

        // if length is greater than 3 or ==, continue
            if (length >= 3) {
            // we can make a pattern and then look for that in the array
            // make a pattern of "000" and find [i]s that make up every repeat of that pattern

            // for loop
            for (int flower : flowerbed) {
                // if flower != num, add one to 'count'
                if (flower != num) {
                    count ++;
                }

                // if count == 3, add one to 'flowerCount'
                if (count == 3) {
                    flowerCount ++;
                    // also set count to 0 again
                    count = 0;
                }

                // if flower == num, set 'count' to 0
                if (flower == num) {
                    count = 0;
                }
            }
        } else {
            // if array contains a 1 return false
            boolean test = Arrays.asList(flowerbed).contains(num);
            if (flowerbed.length <= 2 && test) {
                return false;
            }
        }
        // if 'n' <= flowerCount, return true
            if (n <= flowerCount) {
            return true;
        } else {
            // else return false
            return false;
        }
    }
}
