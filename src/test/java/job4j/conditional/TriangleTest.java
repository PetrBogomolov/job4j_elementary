package job4j.conditional;

import org.junit.Test;
import ru.job4j.conditional.Point;
import ru.job4j.conditional.Triangle;

import static org.junit.Assert.*;

public class TriangleTest {

   @Test
   public void areaOfTriangle() {
       Point a = new Point(0, 0);
       Point b = new Point(4, 0);
       Point c = new Point(0, 4);
       Triangle triangle = new Triangle(a, b, c);
       double result = triangle.area();
       double expect = 8;
       assertEquals(expect, result, 0.001);
   }
}