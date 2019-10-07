package com.mainacad.triangle;

import com.mainacad.abs.AbstractShape;
import com.mainacad.abs.Shape;

public class Triangle extends AbstractShape {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    @Override
    public double getArea() {
        double p = (sideOne + sideTwo + sideThree) / 2;

        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }
}
