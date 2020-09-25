package ru.job4j.conditional;

import org.junit.Test;

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
}