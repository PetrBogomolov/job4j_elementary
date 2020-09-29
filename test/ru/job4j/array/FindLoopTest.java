package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas2Then0() {
        int[] numbers = {0, 1, 2, 3, 4, 5};
        int result = FindLoop.indexOf(numbers, 2);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNotNumberThenMinus1() {
        int[] numbers = {0, 1, 2, 3, 4, 5};
        int result = FindLoop.indexOf(numbers, 6);
        int expected = -1;
        assertEquals(expected, result);
    }
}