package ru.job4j.conditional;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int stage1 = x2 - x1;
        int stage2 = y2 - y1;
        double stage3 = Math.pow(stage1, 2);
        double stage4 = Math.pow(stage2, 2);
        double stage5 = stage3 + stage4;
        return Math.sqrt(stage5);
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 2, 6, 4);
        System.out.println("result (5, 2) to (6, 4) = " + result);
    }
}
