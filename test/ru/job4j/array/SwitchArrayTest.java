package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenArray1234567Swap2To5Then1264537() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] result = SwitchArray.swap(numbers, 2, 5);
        int[] expect = {1, 2, 6, 4, 5, 3, 7};
        assertArrayEquals(expect, result);
    }

    @Test
    public void whenArray1234567Swap1To4Then1264537() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] result = SwitchArray.swap(numbers, 2, 5);
        int[] expect = {1, 2, 6, 4, 5, 3, 7};
        assertArrayEquals(expect, result);
    }
}