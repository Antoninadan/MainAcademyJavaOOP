package com.mainacad;

import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {

    static String myName = "Antonina Dan";

    public static void main(String[] args) {
        System.out.println("My name is " + myName); //static field for static method

        Square square10 = new Square();
        square10.setSide(10.0);
        System.out.println(
                "Square with side " +
                        square10.getSide() + " has area " +
                        square10.getArea());


        Circle circle10 = new Circle();
        circle10.setRadius(20.0);
        System.out.println(
                "Circle with radius " +
                        circle10.getRadius() + " has area " +
                        circle10.getArea());


        Triangle triangle10 = new Triangle();
        triangle10.setSideOne(2.0);
        triangle10.setSideTwo(3.0);
        triangle10.setSideThree(4.0);
        System.out.println(
                "Triangle with side one " + triangle10.getSideOne()
                        + ", side two " + triangle10.getSideTwo()
                        + ", side three " + triangle10.getSideThree()
                        + " has area " +
                        triangle10.getArea());
    }

}
