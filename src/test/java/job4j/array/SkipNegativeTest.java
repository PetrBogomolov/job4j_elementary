package job4j.array;

import org.junit.Test;
import ru.job4j.array.SkipNegative;

import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void skipNegativeElement() {
        int[][] array = {
                {1, 2, -2},
                {-1, 2, 1},
                {2, -3, 1}
        };

        int[][] result = SkipNegative.skip(array);

        int[][] arrayEcpect = {
                {1, 2, 0},
                {0, 2, 1},
                {2, 0, 1}
        };
        assertArrayEquals(arrayEcpect, result);

    }
}