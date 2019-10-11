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

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public Triangle() {
    }

    @Override
    public double getArea() {
        double p = (sideOne + sideTwo + sideThree) / 2;

        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }

//    @Override
//    public int hashCode() {
//        return (int)(sideOne + sideTwo + sideThree);  // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    }

    public boolean equals (Object obj){
        Triangle triangle = (Triangle) obj;
        return triangle.sideOne == this.sideOne
                && triangle.sideTwo == this.sideTwo
                && triangle.sideThree == this.sideThree;
    }
}
