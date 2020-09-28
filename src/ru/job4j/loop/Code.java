package ru.job4j.loop;

public class Code {

    public static void generateDateOfStartOfStudy() {
        int dateStartOfStudy = 23;
        int monthOfStartOfStudy = 9;
        int yearOfStartOfStudy = 2020;
        System.out.println("Я начал учиться: " + dateStartOfStudy + "." + monthOfStartOfStudy + "." + yearOfStartOfStudy);
    }

    public static void main(String[] args) {
        String nameOfCourse = "Job4j";
        String nameOfStudent = "Petr Bogomoov";
        System.out.println("Привет, меня зовут " + nameOfStudent + ", я учусь на курсах " + nameOfCourse);
        Code.generateDateOfStartOfStudy();
    }
}
