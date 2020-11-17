package job4j.pojo;

import org.junit.Test;
import ru.job4j.pojo.Product;
import ru.job4j.pojo.Shop;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class ShopTest {

    @Test
    public void whenLastNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl, is(3));
    }

    @Test
    public void whenFirstNull() {
        Product[] products = new Product[5];
        products[1] = new Product("Milk", 10);
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl, is(0));
    }

    @Test
    public void whenHasNotNull() {
        Product[] products = new Product[1];
        products[0] = new Product("Milk", 10);
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl, is(-1));
    }

    @Test
    public void whenDropFirst() {
        Product[] products = new Product[4];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Better", 4);
        products[3] = new Product("Oil", 4);
        Product[] rsl = Shop.leftShift(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1].getName(), is("Better"));
        assertThat(rsl[2].getName(), is("Oil"));
        assertThat(rsl[3], is(nullValue()));
    }

    @Test
    public void whenDropLast() {
        Product[] products = new Product[4];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Better", 4);
        products[3] = new Product("Oil", 4);
        Product[] rsl = Shop.leftShift(products, 3);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1].getName(), is("Bread"));
        assertThat(rsl[2].getName(), is("Better"));
        assertThat(rsl[3], is(nullValue()));
    }

}