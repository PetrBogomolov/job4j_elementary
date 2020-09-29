package ru.job4j.array;

import java.util.Arrays;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        int temp2 = array[1];
        array[1] = array[2];
        array[2] = temp2;
        int temp3 = array[3];
        array[3] = array[4];
        array[4] = temp3;
        for (int index : array) {
            System.out.print(index);
        }
        System.out.println();
        /*
         может быть такой метод будет рассказан далее, но я решил применить его в этом задании
         */
        int[] example = {5, 3, 2, 1, 4};
        Arrays.sort(example);
        for (int index : example) {
            System.out.print(index);
        }

    }
}
