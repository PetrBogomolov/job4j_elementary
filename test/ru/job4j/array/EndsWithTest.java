package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'h', 'u'};
        boolean result = EndsWith.endsWith(word, pref);
        boolean expect = false;
        assertEquals(expect, result);
    }

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, pref);
        boolean expect = true;
        assertEquals(expect, result);
    }
}