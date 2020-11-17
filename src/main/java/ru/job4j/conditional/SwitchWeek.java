package ru.job4j.conditional;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        return switch (day) {
            case (1) -> "Понедельник";
            case (2) -> "Вторник";
            case (3) -> "Среда";
            case (4) -> "Четверг";
            case (5) -> "Пятница";
            case (6) -> "Суббота";
            case (7) -> "Воскресенье";
            default -> "Ошибка";
        };
    }

    public static void main(String[] args) {
        System.out.println(SwitchWeek.nameOfDay(1));
        System.out.println(SwitchWeek.nameOfDay(2));
        System.out.println(SwitchWeek.nameOfDay(3));
        System.out.println(SwitchWeek.nameOfDay(4));
        System.out.println(SwitchWeek.nameOfDay(5));
        System.out.println(SwitchWeek.nameOfDay(6));
        System.out.println(SwitchWeek.nameOfDay(7));
        System.out.println(SwitchWeek.nameOfDay(8));
    }
}