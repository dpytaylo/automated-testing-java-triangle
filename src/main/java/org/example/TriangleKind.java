package org.example;

public enum TriangleKind {
    NON_EXISTENT {
        @Override
        public String toString() {
            return "Треугольник не существует";
        }
    },
    EQUILATERAL {
        @Override
        public String toString() {
            return "Равносторонний треугольник";
        }
    },
    ISOSCELES {
        @Override
        public String toString() {
            return "Равнобедренный треугольник";
        }
    },
    SCALENE {
        @Override
        public String toString() {
            return "Разносторонний треугольник";
        }
    },
}
