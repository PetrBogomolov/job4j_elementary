package ru.job4j.conditional;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(10, 9, 8);
        assertEquals(10, result);
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(9, 10, 8);
        assertEquals(10, result);
    }

    @Test
    public void whenThridMax() {
        int result = MultiMax.max(8, 9, 10);
        assertEquals(10, result);
    }

    @Test
    public void whenAllEqual() {
        int result = MultiMax.max(10, 10, 10);
        assertEquals(10, result);
    }
}