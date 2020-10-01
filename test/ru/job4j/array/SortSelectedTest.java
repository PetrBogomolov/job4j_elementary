package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenArray963ThenArray369() {
        int[] result = SortSelected.sort(new int[] {9, 6, 3});
        int[] expect = {3, 6, 9};
        assertArrayEquals(expect, result);
    }

    @Test
    public void whenArray54321ThenArray12345() {
        int[] result = SortSelected.sort(new int[] {5, 4, 3, 2, 1});
        int[] expect = {1, 2, 3, 4, 5};
        assertArrayEquals(expect, result);
    }

    @Test
    public void whenArray7518ThenArray1578() {
        int[] result = SortSelected.sort(new int[] {7, 5, 1, 8});
        int[] expect = {1, 5, 7, 8};
        assertArrayEquals(expect, result);
    }
}