package ru.job4j.conditional;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + bc > ac && bc + ac > ab && ab + ac > bc;
    }
}
