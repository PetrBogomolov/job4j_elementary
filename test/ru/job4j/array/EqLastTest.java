package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenLastElementsOfArraysEqualThenTrue() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        assertEquals(true, EqLast.check(left, right));
    }

    @Test
    public void whenLastElementsOfArraysNotEqualThenFalse() {
        int[] left = {1, 2, 3};
        int[] right = {5, 6};
        assertEquals(false, EqLast.check(left, right));
    }
}