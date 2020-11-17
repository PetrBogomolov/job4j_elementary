package ru.job4j.interfaces;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезда передвигаются по железным дорогам");
    }

    @Override
    public void transportPassanger() {
        System.out.println("Перевозят пассажиров на среднии и дальнии расстояния");
    }
}
