package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student petr = new Student();
        petr.setName("Bogomolov Petr");
        petr.setGroup("ru 1234");
        petr.setStartStudy("23.09.2020");
        System.out.println("name: " + petr.getName() + System.lineSeparator() +
                           "group number: " + petr.getGroup() + System.lineSeparator() +
                           "date start of study: " + petr.getStartStudy());
    }
}
