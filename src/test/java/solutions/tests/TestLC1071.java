package solutions.tests;

import org.example.solutions.LC1071;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLC1071 {
    LC1071 solution = new LC1071();

    @Test
    void testKidsWithCandies() {
        int[] candies = new int[3];
        candies[0] = 8;
        candies[1] = 2;
        candies[2] = 4;

        List<Boolean> expected = new ArrayList<>();
        expected.add(true);
        expected.add(false);
        expected.add(false);

        List<Boolean> actual = solution.kidsWithCandies(candies, 3);

        assertEquals(expected, actual);
    }

    @Test
    void testKidsWithCandy() {
        int[] candies = new int[3];
        candies[0] = 8;
        candies[1] = 2;
        candies[2] = 4;

        List<Boolean> expected = new ArrayList<>();
        expected.add(true);
        expected.add(false);
        expected.add(false);

        List<Boolean> actual = solution.kidsWithCandy(candies, 3);

        assertEquals(expected, actual);
    }
}
