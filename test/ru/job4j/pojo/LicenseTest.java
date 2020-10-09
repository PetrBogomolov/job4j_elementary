package ru.job4j.pojo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LicenseTest {
    License first;
    License second;

    @Before
    public void setup() {
        first = new License();
        second = new License();
    }

    @Test
    public void whenEqualOwner() {
        first.setCode("Petr");
        second.setCode("Petr");
        Assert.assertEquals(first, second);
    }

    @Test
    public void whenEqualModel() {
        first.setCode("toyota");
        second.setCode("toyota");
        Assert.assertEquals(first, second);
    }

    @Test
    public void whenEqualCode() {
        first.setCode("12rt");
        second.setCode("12rt");
        Assert.assertEquals(first, second);
    }
}