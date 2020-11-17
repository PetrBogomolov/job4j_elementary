package ru.job4j.conditional;

public class SqArea {

    public static double square(int perimeter, int coefficient) {
        double height = (double) perimeter / (2 * ((double) coefficient + 1));
        double length = height * (double) coefficient;
        return length * height;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);

    }
}
