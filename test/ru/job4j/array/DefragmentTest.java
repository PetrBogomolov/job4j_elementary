package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class DefragmentTest {

    @Test
    public void whenFirstSingleNullThenLastSingleNull() {
        String[] input = {null, "I"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", null};
        assertArrayEquals(expected, compressed);
    }

    @Test
    public void whenSignleNullInRandomOrderThenAllLastSingleIsNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertArrayEquals(expected, compressed);
    }

    @Test
    public void whenAllSingleIsNullThenAllSingleIsNull() {
        String[] input = {null, null, null};
        String[] compressed = Defragment.compress(input);
        String[] expected = {null, null, null};
        assertArrayEquals(expected, compressed);
    }

    @Test
    public void whenAllFirstSingleIsNullThenAllLastSingleIsNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertArrayEquals(expected, compressed);
    }
}