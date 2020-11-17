package job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Mortgage;

import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void whenAmount130Salary90Percent35ThenYearToRepayLoan3() {
        int result = Mortgage.year(130, 90, 35);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void whenAmount100Salary110Percent40ThenYearToRepayLoan2() {
        int result = Mortgage.year(100, 110, 40);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void whenAmount1000Salary1200Percent10ThenYearToRepayLoan1() {
        int result = Mortgage.year(1000, 1200, 10);
        int expected = 1;
        assertEquals(expected, result);
    }
}