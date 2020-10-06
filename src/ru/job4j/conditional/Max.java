package ru.job4j.conditional;

public class Max {
    public static int max(int first, int second) {
        boolean condition = first > second;
        return condition ? first : second;
    }

    public static int max(int first, int second, int third) {
        boolean condition = max(first, second) > third;
        return condition ?  max(first, second) : third;
    }

    public static int max(int first, int second, int third, int four) {
        boolean condition = max(first, second, third) > four;
        return condition ? max(first, second, third) : four;
    }
}
