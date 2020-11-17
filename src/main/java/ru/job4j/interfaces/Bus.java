package ru.job4j.interfaces;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобусы ездят по дорогам общего пользования");
    }

    @Override
    public void transportPassanger() {
        System.out.println("Перевозят пассажиров на короткие и среднии расстояния");
    }
}
