package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a: ");
            var a = scanner.nextInt();

            System.out.print("Enter b: ");
            var b = scanner.nextInt();

            System.out.print("Enter c: ");
            var c = scanner.nextInt();

            checkTriangle(a, b, c);
        } catch(Exception e) {
            System.out.println("Невалидный ввод");
        }
    }

    static void checkTriangle(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0 || a <= c - b || a <= b - c || b <= a - c) {
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