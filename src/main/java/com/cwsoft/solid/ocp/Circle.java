package com.cwsoft.solid.ocp;

// Implement Circle class that adheres to Shape interface
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}