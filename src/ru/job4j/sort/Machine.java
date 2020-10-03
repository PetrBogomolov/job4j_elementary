package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public  int[] change(int money, int price) {
        int[] result = new int[100];
        int size = 0;
        int change = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (change - coins[i] >= 0) {
                result[size] = coins[i];
                change -= coins[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}


