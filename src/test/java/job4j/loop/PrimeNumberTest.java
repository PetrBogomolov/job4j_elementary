package job4j.loop;

import org.junit.Test;
import ru.job4j.loop.PrimeNumber;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void whenFinishNumber1Then0() {
        int result = PrimeNumber.calc(1);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenFinishNumber2Then1() {
        int result = PrimeNumber.calc(2);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void whenFinishNumber7Then4() {
        int result = PrimeNumber.calc(7);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void whenFinishNumber79Then22() {
        int result = PrimeNumber.calc(79);
        int expected = 22;
        assertEquals(expected, result);
    }
}