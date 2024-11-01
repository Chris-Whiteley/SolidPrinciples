package com.cwsoft.solid.ocp;

// ShapeCalculator now works with the Shape interface

/**
 * Benefits of adhering to OCP:
 * No need to modify existing code: If a new shape (like a Triangle) needs to be added, you simply implement
 * the Shape interface without changing the ShapeCalculator class.
 *
 * Extensibility: You can extend functionality (e.g., adding more shapes) by adding new classes rather than
 * altering existing logic.
 *
 * Reduced risk: Modifying existing code always comes with the risk of introducing bugs. OCP minimizes this
 * risk by promoting extension over modification.
 *
 * This way, the system becomes easier to maintain and extend without the danger of breaking existing
 * functionality.
 */
public class ShapeCalculator {

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
