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

            System.out.println(Triangle.check(a, b, c));
        } catch(Exception e) {
            System.out.println("Невалидный ввод");
        }
    }
}