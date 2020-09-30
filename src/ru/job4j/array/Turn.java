package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int leftIndex = 0, rightIndex = array.length - 1; rightIndex >= array.length / 2; leftIndex++, rightIndex--) {
            int storage = array[leftIndex];
            array[leftIndex] = array[rightIndex];
            array[rightIndex] = storage;
        }
        return array;
    }
}
