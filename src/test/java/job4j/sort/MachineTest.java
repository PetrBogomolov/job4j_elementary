package job4j.sort;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.sort.Machine;

import static org.junit.Assert.*;

public class MachineTest {
    Machine machine;

    @Before
    public void setup() {
       machine = new Machine();
    }

    @Test
    public void whenEqualsThen0() {
        int[] result = machine.change(100, 100);
        int[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    public void when50by35Then10And5() {
        int[] result = machine.change(50, 35);
        int[] expected = {10, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void when100by35Then10And10And10And10And10And10And5() {
        int[] result = machine.change(100, 35);
        int[] expected = {10, 10, 10, 10, 10, 10, 5};
        assertArrayEquals(expected, result);
    }
}