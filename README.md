# SOLID Principles in Java

This repository contains examples demonstrating the application of the SOLID design principles in Java, aimed at creating software designs that are more understandable, flexible, and maintainable. Each principle is illustrated with **dos** and **don'ts** in the form of code examples, organized into two packages: `not_so_solid` and `solid`.

## About the SOLID Principles

SOLID is an acronym that represents five principles of object-oriented design:

1. **S** — Single Responsibility Principle (SRP)
2. **O** — Open/Closed Principle (OCP)
3. **L** — Liskov Substitution Principle (LSP)
4. **I** — Interface Segregation Principle (ISP)
5. **D** — Dependency Inversion Principle (DIP)

By following these principles, software becomes easier to maintain, extend, and scale.

## Project Structure

This project is divided into two main packages:

- **`not_so_solid`**: Contains examples where the SOLID principles are not followed. Each class in this package demonstrates common mistakes or "anti-patterns" that violate SOLID principles.
- **`solid`**: Contains improved versions of the examples from `not_so_solid`, modified to adhere to the SOLID principles.

Each SOLID principle is demonstrated with examples in both packages, allowing you to compare and understand the impact of each principle on code structure and design.

## Packages

### `not_so_solid`

The `not_so_solid` package includes classes that violate one or more SOLID principles. The purpose of this package is to highlight common pitfalls and showcase how a lack of adherence to SOLID principles can lead to rigid, hard-to-maintain code.

Each file within this package illustrates a different violation, such as:
- Classes with multiple responsibilities (SRP violation)
- Classes that are difficult to extend (OCP violation)
- Incorrect inheritance hierarchies (LSP violation)
- Large, unwieldy interfaces (ISP violation)
- Tight coupling between classes (DIP violation)

### `solid`

The `solid` package contains the refactored versions of the classes in `not_so_solid`. Here, each class has been redesigned to follow the corresponding SOLID principle. These examples demonstrate how adhering to each principle improves code readability, reusability, and flexibility.

For each principle, you can see:
- How to isolate responsibilities within a class (SRP)
- How to make classes open for extension but closed for modification (OCP)
- How to create inheritance hierarchies that respect the behavior of base classes (LSP)
- How to design specific, focused interfaces (ISP)
- How to use abstractions to reduce coupling (DIP)

## How to Use This Repository

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/solid_examples.git
