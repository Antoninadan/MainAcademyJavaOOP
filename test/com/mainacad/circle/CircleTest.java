package com.mainacad.circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testGetArea() {
        Circle circle = new Circle(20.0);
        double area = circle.getArea();
        assertEquals(1256.6370, area, 0.001);
    }
}