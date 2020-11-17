package job4j.array;

import org.junit.Test;
import ru.job4j.array.ArrayChar;

import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenArraysNotSimilarThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        boolean expect = false;
        assertEquals(expect, result);
    }

    @Test
    public void whenArraysSimilarThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        boolean expect = true;
        assertEquals(expect, result);
    }
}