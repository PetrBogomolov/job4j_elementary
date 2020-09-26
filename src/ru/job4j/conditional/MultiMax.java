package ru.job4j.conditional;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first > second && first > third) {
            result = first;
        } else if (second > first && second > third) {
            result = second;
        }
        return result;
    }
}
