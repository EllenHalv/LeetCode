package org.example.solutions;

/**
 * LC1.
 * Two Sum.
 * Author: Ellen Halvardsson.
 */
public class LC1 {

    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];

        // start with [0] and loop thorugh all to see if they equal 'target'
        for(int i = 0; i < nums.length; i++) {
            // j can always start at i + 1 because we already checked for matches for previous indexes.
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }

        return indices;
    }
}
