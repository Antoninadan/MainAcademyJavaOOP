package com.mainacad.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testGetArea() {
        Triangle square = new Triangle(2.0, 3.0, 4.0);
        double area = square.getArea();
        assertEquals(2.9047, area, 0.001);
    }

    @Test
    void equals() {
        Triangle triangleOne = new Triangle(1.0,2.0,3.0);
        Triangle triangleTwo = new Triangle(1.0,2.0,3.0);
        boolean result = triangleOne.equals(triangleTwo);
        assertEquals(true, result);
    }
}