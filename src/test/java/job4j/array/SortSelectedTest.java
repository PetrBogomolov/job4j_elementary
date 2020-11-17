package job4j.array;

import org.junit.Test;
import ru.job4j.array.SortSelected;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenArray9113ThenArray3911() {
        int[] result = SortSelected.sort(new int[] {9, 11, 3});
        int[] expect = {3, 9, 11};
        assertArrayEquals(expect, result);
    }

    @Test
    public void whenArray54321ThenArray12345() {
        int[] result = SortSelected.sort(new int[] {5, 4, 3, 2, 1});
        int[] expect = {1, 2, 3, 4, 5};
        assertArrayEquals(expect, result);
    }

    @Test
    public void whenArray7516ThenArray1567() {
        int[] result = SortSelected.sort(new int[] {7, 5, 1, 6});
        int[] expect = {1, 5, 6, 7};
        assertArrayEquals(expect, result);
    }
}