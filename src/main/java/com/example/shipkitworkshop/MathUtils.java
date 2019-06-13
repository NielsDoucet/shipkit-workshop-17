package com.example.shipkitworkshop;

public class MathUtils {

    /**
     * Checks if these coordinates form a triangle.
     *
     * @param a first point
     * @param b second point
     * @param c third point
     * @return {@code true} if this is triangle
     */
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c
                && a + c > b
                && b + c > a;
    }
}
