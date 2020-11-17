package job4j.array;

import org.junit.Test;
import ru.job4j.array.MatrixCheck;

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

    @Test
    public void whenExtractDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'O', ' '},
                {' ', ' ', 'D'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'O', 'D'};
        assertArrayEquals(expect, result);
    }

    @Test
    public void whenNotWinThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertEquals(false, result);

    }

    @Test
    public void whenWinInColumnThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertEquals(true, result);
    }

    @Test
    public void whenWinInLineThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertEquals(true, result);
    }
}
