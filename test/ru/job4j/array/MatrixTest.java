package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void multiple() {
        int[][] table = Matrix.multiple(4);
        int[][] expect = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };
        assertArrayEquals(expect, table);
    }
}