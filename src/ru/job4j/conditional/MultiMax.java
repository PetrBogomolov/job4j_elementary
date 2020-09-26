package ru.job4j.conditional;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        result = result > third ? result : third;
        return result;
    }
}