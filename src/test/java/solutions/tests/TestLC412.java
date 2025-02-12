package solutions.tests;

import org.example.solutions.LC412;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLC412 {

    @Test
    void testFizzBuzz3(){

        LC412 solution = new LC412();

        // expected
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");

        // actual
        List<String> actual = solution.fizzBuzz(3);

        // assert
        assertEquals(expected, actual);
    }


    @Test
    void testFizzBuzz5(){

        LC412 solution = new LC412();

        // expected
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");

        // actual
        List<String> actual = solution.fizzBuzz(5);

        // assert
        assertEquals(expected, actual);
    }


    @Test
    void testFizzBuzz15(){

        LC412 solution = new LC412();

        // expected
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        expected.add("Fizz");
        expected.add("7");
        expected.add("8");
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("11");
        expected.add("Fizz");
        expected.add("13");
        expected.add("14");
        expected.add("FizzBuzz");

        // actual
        List<String> actual = solution.fizzBuzz(15);

        // assert
        assertEquals(expected, actual);
    }
}
