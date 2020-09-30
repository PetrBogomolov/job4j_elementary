package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int leftIndex = 0, rightIndex = data.length - 1; rightIndex > leftIndex; rightIndex--) {
            if (data[rightIndex] == data[leftIndex]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
