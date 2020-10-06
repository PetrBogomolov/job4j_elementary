package ru.job4j.conditional;

public class Triangle {
    private final Point first;
    private final Point second;
    private final Point third;

    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public double period(double ab, double bc, double ac) {
        return (ab + bc + ac) / 2;
    }

    public  boolean exist(double ab, double ac, double bc) {
        return ab + bc > ac && bc + ac > ab && ab + ac > bc;
    }

    public double area() {
        double result = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            double stage1 = p - ab;
            double stage2 = p - bc;
            double stage3 = p - ac;
            double stage4 = p * stage1 * stage2 * stage3;
            result = Math.sqrt(stage4);
        }
        return result;
    }
}
