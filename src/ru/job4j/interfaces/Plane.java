package ru.job4j.interfaces;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолеты летают по воздуху");
    }

    @Override
    public void transportPassanger() {
        System.out.println("Перевозят пассажиров на среднии и дальнии расстояния");
    }
}
