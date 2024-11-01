package com.cwsoft.not_so_solid.ocp;

public class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
}
