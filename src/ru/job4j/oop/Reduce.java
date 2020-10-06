package ru.job4j.oop;

public class Reduce {
    private int[] array;

    public void to(int[] input) {
        this.array = input;
    }

    public void print() {
        for (int i : array) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        Reduce example = new Reduce();
        example.to(new int[] {1, 2, 3});
        example.print();
    }
}
