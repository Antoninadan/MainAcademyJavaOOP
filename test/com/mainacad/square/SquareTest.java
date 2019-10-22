package com.mainacad.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testGetArea() {
        Square square = new Square(20.0);
        double area = square.getArea();
        assertEquals(400, area, 0.001);
    }
}