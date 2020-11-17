package ru.job4j.conditional;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double halfMeter = (a + b + c) / 2;
        double stage1 = halfMeter - a;
        double stage2 = halfMeter - b;
        double stage3 = halfMeter - c;
        double stage4 = halfMeter * stage1 * stage2 * stage3;
        return Math.sqrt(stage4);

    }

    public static void main(String[] args) {
        double areaTrg = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + areaTrg);
    }
}
