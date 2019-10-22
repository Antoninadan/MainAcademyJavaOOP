package com.mainacad;

import com.mainacad.abs.AbstractShape;
import com.mainacad.abs.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRunner {

    static String myName = "Antonina Dan";

    public static void main(String[] args) {
        System.out.println("My name is " + myName); //static field for static method

        Square square10 = new Square();
        square10.setSide(10.0);
        square10.setName("Square");
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
                "Triangle  with side one " + triangle10.getSideOne()
                        + ", side two " + triangle10.getSideTwo()
                        + ", side three " + triangle10.getSideThree()
                        + " has area " +
                        triangle10.getArea());
        
        AbstractShape abstractShape = new AbstractShape() {
            @Override
            public double getArea() {
                return 900000;
            }
        };

//        AbstractShape triangle = new Triangle();
//        triangle.getArea();
//        System.out.println(triangle.getArea());
//        System.out.println("abstractShape.getArea() = " + abstractShape.getArea());

        Shape triangleShape = new Triangle();
        Shape circleShape = new Circle();
        Shape square = new Square();

        Triangle triangleR = new Triangle();
        triangleR.setSideOne(12);
        triangleR.setSideTwo(12);
        triangleR.setSideThree(12);

        Circle circleR = new Circle();
        circleR.setRadius(12);

        Square squareR = new Square();
        squareR.setSide(12);

        Shape maxShape;

        if (circleR.getArea() > squareR.getArea()) {
            maxShape = circleR;
        } else {maxShape = squareR;}

        if (triangleR.getArea() > maxShape.getArea()) {
            maxShape = triangleR;
        }

        System.out.println("maxShape.getArea = " + maxShape.getArea()
                + " shape is " + maxShape.getClass().getSimpleName());

        Triangle triangleTwo = new Triangle(12, 13, 11);
        Triangle triangleThree = new Triangle(12, 13, 11);
        System.out.println(triangleTwo.equals(triangleThree));

        // how to iter List
        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle10);
        shapes.add(triangleR);
        shapes.add(circle10);
        shapes.add(circleR);
        shapes.add(square10);
        shapes.add(squareR);

        Shape maxShp = shapes.get(0);
        for (int i = 1; i<shapes.size(); i++) {
            if(shapes.get(i).getArea() > maxShp.getArea()) {
                maxShp = shapes.get(i);
            }
        }
        System.out.println("maxShape is (" + maxShp.getClass().getSimpleName() + ") = " + maxShp.getArea());
    }

}
