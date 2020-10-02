package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenArrayHasSimilarElementsInLineThenTrue() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertEquals(true, result);
    }

    @Test
    public void whenArrayHasNotSimilarElementsInLineThenFalse() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertEquals(false, result);
    }

    @Test
    public void whenArrayHasSimilarElementsInColumnThenTrue() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertEquals(true, result);
    }

    @Test
    public void whenArrayHasNotSimilarElementsInColumnThenFalse() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertEquals(false, result);
    }
}
