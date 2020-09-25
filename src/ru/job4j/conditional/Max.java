package ru.job4j.conditional;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static void main(String[] args) {
       int result = Max.max(123, 15);
        System.out.println(result);
    }
}
