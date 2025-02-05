package solutions.tests;

import org.example.solutions.LC1768;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLC1768 {
    LC1768 solution = new LC1768();

    @Test
    void testMergeAlternately() {
        String expected = "adbecf";
        String actual = solution.mergeAlternately("abc", "def");

        assertEquals(expected, actual);
    }

    @Test
    void testMergeAlt() {
        String expected = "adbecf";
        String actual = solution.mergeAlt("abc", "def");

        assertEquals(expected, actual);
    }
}
