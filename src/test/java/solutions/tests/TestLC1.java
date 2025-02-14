package solutions.tests;

import org.example.solutions.LC1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLC1 {

    @Test
    void testTwoSum() {
        LC1 solution = new LC1();

        // expected
        int[] expected = new int[] {0, 3};

        // actual
        int[] actual = solution.twoSum(new int[] {2, 5, 3, 4}, 6);

        // assert
        assertArrayEquals(expected, actual);
    }
}
