package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load += another.load;
    }

    public static void main(String[] args) {
        Battery full = new Battery(100);
        Battery quarter = new Battery(25);
        full.exchange(quarter);
        System.out.println(full.load);
        System.out.println(quarter.load);
    }
}
