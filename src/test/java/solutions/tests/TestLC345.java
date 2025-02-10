package solutions.tests;

import org.example.solutions.LC345;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLC345 {

    @Test
    void testReverseVowels() {
        LC345 solution = new LC345();
        String s = "hEllO";

        //expected
        String expected = "hOllE";

        //actual
        String actual = solution.reverseVowels(s);

        //assert
        assertEquals(expected, actual);
    }

    @Test
    void testReverseVowelsLonger() {
        LC345 solution = new LC345();
        String s = "hEllOaOiUvklueaP";

        //expected
        String expected = "halleuUiOvklaOEP";

        //actual
        String actual = solution.reverseVowels(s);

        //assert
        assertEquals(expected, actual);
    }
}
