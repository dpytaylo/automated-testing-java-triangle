package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        var a = scanner.nextDouble();

        System.out.print("Enter b: ");
        var b = scanner.nextDouble();

        System.out.print("Enter c: ");
        var c = scanner.nextDouble();

        checkTriangle(a, b, c);
    }

    static void checkTriangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Треугольник не существует");
            return;
        }

        if (a == b && b == c) {
            System.out.println("Равносторонний треугольник");
            return;
        }

        if (a == b || b == c || a == c) {
            System.out.println("Равнобедренный треугольник");
            return;
        }

        System.out.println("Разносторонний треугольник");
    }
}