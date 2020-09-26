package ru.job4j.conditional;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenTriangleExist() {
        boolean result = Triangle.exist(4.0, 4.0, 4.0);
        assertEquals(true, result);
    }

    @Test
    public void whenTriangleNoExist() {
        boolean result = Triangle.exist(4.0, 4.0, 9.0);
        assertEquals(false, result);

    }
}