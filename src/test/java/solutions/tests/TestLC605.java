package solutions.tests;

import org.example.solutions.LC605;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLC605 {

    @Test
    void testCanPlaceFlowersTrue() {
        LC605 solution = new LC605();
        int[] flowerbed = {1, 0, 1, 0, 0, 0, 1, 0, 0, 0};
        int n = 2;

        //expected
        boolean expected = true;

        //actual
        boolean actual = solution.canPlaceFlower(flowerbed, n);

        //assertEquals
        assertEquals(expected, actual);
    }

    @Test
    void testCanPlaceFlowersFalse() {
        LC605 solution = new LC605();
        int[] flowerbed = {1, 0, 1, 0, 0, 0, 1, 0, 0, 0};
        int n = 10;

        //expected
        boolean expected = false;

        //actual
        boolean actual = solution.canPlaceFlower(flowerbed, n);

        //assertEquals
        assertEquals(expected, actual);
    }
}
