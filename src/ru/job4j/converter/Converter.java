package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inForEuro = 140;
        int expectedForEuro = 2;
        int outForEuro = Converter.rubleToEuro(inForEuro);
        boolean passedForEuro = expectedForEuro == outForEuro;
        System.out.println("140 rubles must be 2 euro. Test result : " + passedForEuro);
        int inForDollar = 140;
        int expectedForDollar = 2;
        int outForDollar = Converter.rubleToDollar(inForDollar);
        boolean passedForDollar = expectedForDollar == outForDollar;
        System.out.println("140 rubles must be 2 dollars. Test result : " + passedForDollar);
    }
}

