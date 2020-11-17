package job4j.conditional;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.conditional.Point;

import static org.junit.Assert.*;

public class PointTest {
    Point a;
    Point b;

    @Before
    public void setup() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
    }

    @Test
    public void when01to02Then1() {
        a = new Point(0, 1);
        b = new Point(0, 2);
        double dist = a.distance(b);
        int expected = 1;
        assertEquals(expected, dist, 0.01);
    }

   @Test
    public void when00to00Then0() {
        a = new Point(0, 0);
        b = new Point(0, 0);
        double dist = a.distance(b);
        int expected = 0;
        assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when44toMinus3Minus4Then10Comma63() {
        a = new Point(4, 4);
        b = new Point(-3, -4);
        double dist = a.distance(b);
        double expected = 10.63;
        assertEquals(expected, dist, 0.01);
    }

    @Test
    public void whenMinus2Minus3toMinus4Minus1Then2Comma82() {
        a = new Point(-2, -3);
        b = new Point(-4, -1);
        double dist = a.distance(b);
        double expected = 2.82;
        assertEquals(expected, dist, 0.01);
    }

    @Test
    public void whenMinus2Minus3Minus4to4And1And2Then10Comma39() {
        a = new Point(-2, -3, -4);
        b = new Point(4, 3, 2);
        double dist = a.distance3d(b);
        double expected = 10.39;
        assertEquals(expected, dist, 0.01);
    }
}