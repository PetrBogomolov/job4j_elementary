package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenArraysNotSimilarThenFalse() {
        char[] word = {'W', 'o', 'r', 'd'};
        char[] pref = {'P', 'r', 'e', 'f'};
        boolean result = ArrayChar.startsWith(word, pref);
        boolean expect = false;
        assertEquals(expect, result);
    }

    @Test
    public void whenArraysSimilarThenTrue() {
        char[] word = {'W', 'o', 'r', 'd'};
        char[] pref = {'W', 'o', 'r', 'd'};
        boolean result = ArrayChar.startsWith(word, pref);
        boolean expect = true;
        assertEquals(expect, result);
    }
}