package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RublesThen2Euro() {
        int inForEuro = 140;
        int expectedForEuro = 2;
        int outForEuro = Converter.rubleToEuro(inForEuro);
        Assert.assertEquals(expectedForEuro, outForEuro);
    }

    @Test
    public void whenConvert0RublesThen0Euro() {
        int inForEuro = 0;
        int expectedForEuro = 0;
        int outForEuro = Converter.rubleToEuro(inForEuro);
        Assert.assertEquals(expectedForEuro, outForEuro);
    }

    @Test
    public void whenConvert180RublesThen3Dollars() {
        int inForDollar = 180;
        int expectedForDollar = 3;
        int outForDollar = Converter.rubleToDollar(inForDollar);
        Assert.assertEquals(expectedForDollar, outForDollar);
    }

    @Test
    public void whenConvert0RublesThen0Dollars() {
        int inForDollar = 0;
        int expectedForDollar = 0;
        int outForDollar = Converter.rubleToDollar(inForDollar);
        Assert.assertEquals(expectedForDollar, outForDollar);
    }
}