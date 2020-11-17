package job4j.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.Min;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenMinElementEqual2Then2() {
        Assert.assertEquals(2, Min.findMin(new int[] {3, 5, 6, 2, 7}));
    }

    @Test
    public void whenMinElementEqual1Then1() {
        assertEquals(1, Min.findMin(new int[] {1, 5, 6, 2, 7}));
    }

    @Test
    public void whenMinElementEqual0Then0() {
        assertEquals(0, Min.findMin(new int[] {3, 5, 6, 2, 0}));
    }

    @Test
    public void whenMinElementInRangeFrom2Before5Equal0Then0() {
        assertEquals(0, Min.findMinOfRange(new int[] {3, 5, 6, 2, 0, 9, 5, 11}, 2, 5));
    }

    @Test
    public void whenMinElementInRangeFrom3Before7Equal0Then0() {
        assertEquals(2, Min.findMinOfRange(new int[] {3, 5, 6, 2, 6, 9, 5, 11}, 3, 7));
    }

}