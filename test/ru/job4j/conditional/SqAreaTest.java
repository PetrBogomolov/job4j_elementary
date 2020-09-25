package ru.job4j.conditional;

import org.junit.Test;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP9K4Then3Comma24() {
        int p = 9;
        int k = 4;
        double expected = 3.24;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K11Then2Comma75() {
        int p = 12;
        int k = 11;
        double expected = 2.75;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP129K111Then36Comma81() {
        int p = 129;
        int k = 111;
        double expected = 36.81;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP128K12Then290Comma84() {
        int p = 128;
        int k = 12;
        double expected = 290.84;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP128K5Then568Comma88() {
        int p = 128;
        int k = 5;
        double expected = 568.88;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K15Then0Comma93() {
        int p = 8;
        int k = 15;
        double expected = 0.93;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K155Then0Comma10() {
        int p = 8;
        int k = 155;
        double expected = 0.10;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}