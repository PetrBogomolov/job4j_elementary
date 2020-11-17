package job4j.array;

import org.junit.Test;
import ru.job4j.array.Turn;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenArray1357ThenReverseArray7531() {
        int[] sourse = {1, 3, 5, 7};
        int[] result = Turn.back(sourse);
        int[] expect = {7, 5, 3, 1};
        assertArrayEquals(expect, result);
    }

    @Test
    public void whenArray13579ThenReverseArray97531() {
        int[] sourse = {1, 3, 5, 7, 9};
        int[] result = Turn.back(sourse);
        int[] expect = {9, 7, 5, 3, 1};
        assertArrayEquals(expect, result);
    }
}