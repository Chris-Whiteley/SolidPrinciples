package com.cwsoft.solid.lsp;

/**
 * Key Points:
 * Shape Interface: The Shape interface defines the contract for calculating the area.
 * This allows any shape, whether it's a Rectangle, Square, Circle, etc.,
 * to provide its own implementation of the getArea() method.
 *
 * Liskov Substitution Principle (LSP):
 * Both Rectangle and Square now adhere to LSP. You can replace a Rectangle with a Square (or vice versa)
 * wherever a Shape is expected without breaking the program or altering its correctness.
 *
 * Benefits of This Design:
 * Adheres to SRP: Each class (Rectangle, Square) only has one responsibility: managing the specific
 * details of its shape.
 *
 * Adheres to LSP: Both Rectangle and Square can be substituted anywhere a Shape is expected, ensuring
 * correct behavior.
 *
 * Extensible: If you want to add more shapes in the future (e.g., Circle, Triangle), you just implement
 * the Shape interface without modifying the existing code.
 *
 * This design provides flexibility and future-proofing while adhering to the SOLID principles!
 *
 */
public class ShapeCalculator {

    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(5);

        printArea(rectangle); // Outputs: Area: 50
        printArea(square);    // Outputs: Area: 25
    }
}