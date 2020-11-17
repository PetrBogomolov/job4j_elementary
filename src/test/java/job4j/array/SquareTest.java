package job4j.array;

import org.junit.Test;
import ru.job4j.array.Square;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound5Then024916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = {0, 1, 4, 9, 16};
        assertArrayEquals(expected, result);
    }
}