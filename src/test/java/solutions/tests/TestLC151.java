package solutions.tests;

import org.example.solutions.LC151;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLC151 {

    @Test
    void testReverseWords() {
        LC151 solution = new LC151();
        String s = " sky   is blue  ";

        // expected
        String expected = "blue is sky";

        //actual
        String actual = solution.reverseWords(s);

        //assert
        assertEquals(expected, actual);
    }

    @Test
    void testReverseWord() {
        LC151 solution = new LC151();
        String s = " sky   is blue  ";

        // expected
        String expected = "blue is sky";

        //actual
        String actual = solution.reverseWords(s);

        //assert
        assertEquals(expected, actual);
    }

    @Test
    void testReverseWordsLonger() {
        LC151 solution = new LC151();
        String s = " sky   is blue  and it is   a beautiful day  ";

        // expected
        String expected = "day beautiful a is it and blue is sky";

        //actual
        String actual = solution.reverseWords(s);

        //assert
        assertEquals(expected, actual);
    }
}
