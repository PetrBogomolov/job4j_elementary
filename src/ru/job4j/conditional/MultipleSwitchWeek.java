package ru.job4j.conditional;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Monday", "Понедельник" -> 1;
            case "Tuesday", "Вторник" -> 2;
            case "Wednesday", "Среда" -> 3;
            case "Thursday", "Четверг" -> 4;
            case "Friday", "Пятница" -> 5;
            case "Saturday", "Суббота" -> 6;
            case "Sunday", "Воскресенье" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.print(MultipleSwitchWeek.numberOfDay("Monday"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Понедельник"));
        System.out.print(MultipleSwitchWeek.numberOfDay("Tuesday"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Вторник"));
        System.out.print(MultipleSwitchWeek.numberOfDay("Wednesday"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Среда"));
        System.out.print(MultipleSwitchWeek.numberOfDay("Thursday"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Четверг"));
        System.out.print(MultipleSwitchWeek.numberOfDay("Friday"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Пятница"));
        System.out.print(MultipleSwitchWeek.numberOfDay("Saturday"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Суббота"));
        System.out.print(MultipleSwitchWeek.numberOfDay("Sunday"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Воскресенье"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Середа"));

    }
}
