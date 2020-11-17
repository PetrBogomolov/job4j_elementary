package job4j.conditional;

import org.junit.Test;
import ru.job4j.conditional.ThreeMax;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int result = ThreeMax.max(10, 5, 1);
        assertThat(result, is(10));
    }

    @Test
    public void secondMax() {
        int result = ThreeMax.max(10, 50, 1);
        assertThat(result, is(50));
    }

    @Test
    public void thirdMax() {
        int result = ThreeMax.max(1, 5, 100) ;
        assertThat(result, is(100));
    }

    @Test
    public void allEqually() {
        int result = ThreeMax.max(1, 1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void firstEquallySecond() {
        int result = ThreeMax.max(10, 10, 1);
        assertThat(result, is(10));
    }

    @Test
    public void firstEquallyThird() {
        int result = ThreeMax.max(100, 1, 100);
        assertThat(result, is(100));
    }

    @Test
    public void secondEquallyThird() {
        int result = ThreeMax.max(1, 100, 100);
        assertThat(result, is(100));
    }
}