package org.example;

public class Triangle {
    public static TriangleKind check(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0 || a <= c - b || a <= b - c || b <= a - c) {
            return TriangleKind.NON_EXISTENT;
        }

        if (a == b && b == c) {
            System.out.println("Равносторонний треугольник");
            return TriangleKind.EQUILATERAL;
        }

        if (a == b || b == c || a == c) {
            return TriangleKind.ISOSCELES;
        }

        return TriangleKind.SCALENE;
    }
}
