package job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int result = Counter.sumByEven(1, 10);
        int expected = 30;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromFiveToTwelveThenThirtySix() {
        int result = Counter.sumByEven(5, 12);
        int expected = 36;
        assertEquals(expected, result);
    }
}