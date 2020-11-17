package job4j.conditional;

import org.junit.Test;
import ru.job4j.conditional.Max;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when12more10Then12() {
        int left = 12;
        int right = 10;
        int expected = 12;
        int result = Max.max(left, right);
        assertEquals(expected, result);
    }

    @Test
    public void when12less22Then22() {
        int left = 12;
        int right = 22;
        int expected = 22;
        int result = Max.max(left, right);
        assertEquals(expected, result);
    }

    @Test
    public void when12equally12Then12() {
        int left = 12;
        int right = 12;
        int expected = 12;
        int result = Max.max(left, right);
        assertEquals(expected, result);
    }

    @Test
    public void when12more11And10Then12() {
        int first = 12;
        int second = 11;
        int third = 10;
        int result = Max.max(first, second, third);
        assertEquals(12, result);
    }

    @Test
    public void when13more12And11And10Then13() {
        int first = 12;
        int second = 11;
        int third = 10;
        int four = 13;
        int result = Max.max(first, second, third, four);
        assertEquals(13, result);
    }
}