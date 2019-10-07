package com.mainacad.triangle;

public class Triangle {
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

    public double getArea(){
        double p = (sideOne + sideTwo + sideThree) / 2;

        return Math.sqrt(p*(p-sideOne)*(p-sideTwo)* (p-sideThree));
    }
}
