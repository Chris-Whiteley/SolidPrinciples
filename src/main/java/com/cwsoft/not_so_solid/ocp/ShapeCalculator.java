package com.cwsoft.not_so_solid.ocp;

/**
 * Example of a violation of OCP:
 * Let's say we have a Shape class, and we want to calculate the area of different shapes
 * (e.g., circles, rectangles). If we keep adding new types of shapes and modify the Shape class each time,
 * we violate the Open/Closed Principle because we are changing the class frequently.
 */
public class ShapeCalculator {

    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRadius() * circle.getRadius();
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getLength() * rectangle.getBreadth();
        }
        return 0;
    }
}

