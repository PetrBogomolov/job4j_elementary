package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[count++] = left[i++];
            } else {
                result[count++] = right[j++];
            }
        }
        while (i < left.length) {
            result[count++] = left[i++];
        }
        while (j < right.length) {
            result[count++] = right[j++];
        }
        return result;
    }
}

