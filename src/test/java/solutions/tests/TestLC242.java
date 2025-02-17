package solutions.tests;

import org.example.solutions.LC242;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLC242 {

    @Test
    void testIsAnagramTrue() {
        // expected
        boolean expected = true;

        // actual
        boolean actual = LC242.isAnagram("tam", "mat");

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testIsAnagramFalse() {
        // expected
        boolean expected = false;

        // actual
        boolean actual = LC242.isAnagram("tamagochi", "mat");

        // assert
        assertEquals(expected, actual);
    }
}
