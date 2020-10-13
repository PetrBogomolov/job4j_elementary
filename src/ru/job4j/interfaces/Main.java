package ru.job4j.interfaces;

public class Main {
    public static void main(String[] args) {
        Vehicle urbanBus = new Bus();
        Vehicle intercityBus = new Bus();
        Vehicle fastTrain = new Train();
        Vehicle ordinaryTrain = new Train();
        Vehicle internationalPlane = new Plane();
        Vehicle internalPlane = new Plane();
        Vehicle[] allVehicle = {urbanBus, intercityBus, fastTrain, ordinaryTrain, internationalPlane, internalPlane};
        for (Vehicle index : allVehicle) {
            index.move();
            index.transportPassanger();
        }
    }
}
