package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvan90Nik110Then1Month() {
        int month = Fitness.calc(90, 110);
        int expected = 1;
        assertEquals(expected, month);
    }

    @Test
    public void whenIvan50Nik90Then2Month() {
        int month = Fitness.calc(50, 90);
        int expected = 2;
        assertEquals(expected, month);
    }

    @Test
    public void whenIvan90Nik80Then0Month() {
        int month = Fitness.calc(90, 80);
        int expected = 0;
        assertEquals(expected, month);
    }
}