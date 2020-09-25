package ru.job4j.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan190Then103() {
        short height = 190;
        double expected = 103.5;
        double out = Fit.manWeight(height);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman167Then65() {
        short height = 167;
        double expected = 65.55;
        double out = Fit.womanWeight(height);
        assertEquals(expected, out, 0.01);

    }
}