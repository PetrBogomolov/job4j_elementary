package ru.job4j.oop;

public class Reduce {
    private int[] array;

    public void to(int[] input) {
        array = input;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(input);
        reduce.print();
    }
}
