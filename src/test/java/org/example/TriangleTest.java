package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    static Stream<int[]> provideNonExistentTriangles() {
        return Stream.of(
                new int[]{-1, -2, -3},
                new int[]{0, 0, 0},
                new int[]{0, 3, 4},
                new int[]{1, 2, 3}
        );
    }

    @ParameterizedTest
    @MethodSource("provideNonExistentTriangles")
    void checkNonExistentTrianglesTest(int[] sides) {
        assertEquals(TriangleKind.NON_EXISTENT, Triangle.check(sides[0], sides[1], sides[2]));
    }

    static Stream<int[]> provideEquilateralTriangles() {
        return Stream.of(
                new int[]{1, 1, 1},
                new int[]{2147483647, 2147483647, 2147483647}
        );
    }

    @ParameterizedTest
    @MethodSource("provideEquilateralTriangles")
    void checkEquilateralTrianglesTest(int[] sides) {
        assertEquals(TriangleKind.EQUILATERAL, Triangle.check(sides[0], sides[1], sides[2]));
    }

     static Stream<int[]> provideIsoscelesTriangles() {
        return Stream.of(
                new int[]{2, 2, 3},
                new int[]{2147483646, 2147483646, 2147483647}
        );
    }

    @ParameterizedTest
    @MethodSource("provideIsoscelesTriangles")
    void checkIsoscelesTrianglesTest(int[] sides) {
        assertEquals(TriangleKind.ISOSCELES, Triangle.check(sides[0], sides[1], sides[2]));
    }

    static Stream<int[]> provideScaleneTriangles() {
        return Stream.of(
                new int[]{2, 3, 4},
                new int[]{2147483645, 2147483646, 2147483647}
        );
    }

    @ParameterizedTest
    @MethodSource("provideScaleneTriangles")
    void checkScaleneTrianglesTest(int[] sides) {
        assertEquals(TriangleKind.SCALENE, Triangle.check(sides[0], sides[1], sides[2]));
    }
}