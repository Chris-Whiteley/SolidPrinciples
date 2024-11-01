package com.cwsoft.not_so_solid.lsp;

/**
 * While it seems logical to inherit Square from Rectangle because a square is a type of rectangle, this design
 * violates the Liskov Substitution Principle.
 *
 *  Why? Because Square changes the behavior of the setWidth and setHeight methods, which breaks the expectations for how
 *       a rectangle should behave.
 *
 * For instance, if a method expects a Rectangle and relies on being able to independently set the width and height,
 * passing a Square will lead to unexpected results:
 *
 */
public class Resize {
    public void resizeRectangle(Rectangle rectangle) {
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        assert rectangle.getArea() == 50;  // This will fail if a Square is passed in!
    }
}
