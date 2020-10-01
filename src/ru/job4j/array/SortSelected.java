package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 1; index < data.length; index++) {
            int min = Min.findMinOfRange(data, 0, data.length - 1);
            int indexMin = FindLoop.indexOfRange(data, min, 0, data.length - 1);
            int save = data[0];
            data[0] = min;
            data[indexMin] = save;
            for (int j = index + 1; j < data.length; j++) {
                if (data[index] > data[j]) {
                    int temp = data[index];
                    data[index] = data[j];
                    data[j] = temp;
                }
            }

        }
        return data;
    }
}
