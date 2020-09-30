package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = false;
        for (int indexLeft = 0; indexLeft < left.length; indexLeft++) {
            for (int indexRight = 0; indexRight < right.length; indexRight++) {
                result = left[left.length - 1] == right[right.length - 1];
            }
        }
        return result;
    }
}
