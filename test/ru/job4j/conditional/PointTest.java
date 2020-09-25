package ru.job4j.conditional;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when01to02then1() {
        int x1 = 0;
        int y1 = 1;
        int x2 = 0;
        int y2 = 2;
        int expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00then0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int expected = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when44toMinus3Minus4then10Comma63014581273465() {
        int x1 = 4;
        int y1 = 4;
        int x2 = -3;
        int y2 = -4;
        double expected = 10.63014581273465;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus1And3to3Minus3then7Comma211102550927978() {
        int x1 = -1;
        int y1 = 3;
        int x2 = 3;
        int y2 = -3;
        double expected = 7.211102550927978;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus2Minus3toMinus4Minus1then2Comma8284271247461903() {
        int x1 = -2;
        int y1 = -3;
        int x2 = -4;
        int y2 = -1;
        double expected = 2.8284271247461903;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}