package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = Min.findMinOfRange(data, index, data.length - 1);
            int indexMin = FindLoop.indexOfRange(data, min, index, data.length - 1);
                int save = data[index];
                data[index] = data[indexMin];
                data[indexMin] = save;
        }
        return data;
    }
}
