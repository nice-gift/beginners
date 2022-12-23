package day9.task2;

import static java.lang.Math.PI;

public class Circle extends Figure {
    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    private int radius;

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
