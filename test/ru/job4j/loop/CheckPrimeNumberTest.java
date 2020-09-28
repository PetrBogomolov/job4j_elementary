package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void whenNumber5ThenTrue() {
        boolean result = CheckPrimeNumber.check(7);
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    public void whenNumber16ThenFalse() {
        boolean result = CheckPrimeNumber.check(16);
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    public void whenNumber1ThenFalse() {
        boolean result = CheckPrimeNumber.check(1);
        boolean expected = false;
        assertEquals(expected, result);
    }
}