package job4j.array;

import org.junit.Test;
import ru.job4j.array.FindLoop;

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

    @Test
    public void whenArrayInRangeFrom3Before5HasElement2Then5() {
        int[] input = {3, 2, 9, 1, 5, 2};
        int value = 2;
        int start = 3;
        int finish = 5;
        int result = FindLoop.indexOfRange(input, value, start, finish);
        int expect = 5;
        assertEquals(expect, result);
    }

    @Test
    public void whenArrayInRangeFrom1Before4HasNotElement8ThenMinus1() {
        int[] input = {3, 2, 9, 1, 5, 2};
        int value = 8;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOfRange(input, value, start, finish);
        int expect = -1;
        assertEquals(expect, result);
    }
}