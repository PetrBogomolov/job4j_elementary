package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenArrayOnlyTrueThenTrue() {
        boolean[] sourse = {true, true,  true};
        boolean result = Check.mono(sourse);
        boolean expect = true;
        assertEquals(expect, result);
    }

    @Test
    public void whenArrayOnlyFalseThenTrue() {
        boolean[] sourse = {false, false,  false};
        boolean result = Check.mono(sourse);
        boolean expect = true;
        assertEquals(expect, result);
    }

    @Test
    public void whenArrayHasTrueAndFalseThenFalse() {
        boolean[] sourse = {true, false, true, false, false};
        boolean result = Check.mono(sourse);
        boolean expect = false;
        assertEquals(expect, result);
    }
}