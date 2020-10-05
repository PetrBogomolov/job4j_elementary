package ru.job4j.conditional;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public  static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        System.out.print(LogicNot.isEven(4));
        System.out.println(LogicNot.isEven(3));
        System.out.print(LogicNot.isPositive(4));
        System.out.println(LogicNot.isPositive(-4));
        System.out.print(LogicNot.notEven(5));
        System.out.println(LogicNot.notEven(4));
        System.out.print(LogicNot.notPositive(-4));
        System.out.println(LogicNot.notPositive(4));
        System.out.print(LogicNot.notEvenAndPositive(5));
        System.out.println(LogicNot.notEvenAndPositive(-4));
        System.out.print(LogicNot.evenOrNotPositive(-4));
        System.out.println(LogicNot.evenOrNotPositive(5));

    }
}
