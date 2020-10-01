package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenMinElementEqual2Then2() {
        assertEquals(2, Min.findMin(new int[] {3, 5, 6, 2, 7}));
    }

    @Test
    public void whenMinElementEqual1Then1() {
        assertEquals(1, Min.findMin(new int[] {1, 5, 6, 2, 7}));
    }

    @Test
    public void whenMinElementEqual0Then0() {
        assertEquals(0, Min.findMin(new int[] {3, 5, 6, 2, 0}));
    }
}