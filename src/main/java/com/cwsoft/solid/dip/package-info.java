package com.cwsoft.solid.dip;
/**
 * The "D" in SOLID stands for Dependency Inversion Principle (DIP). It is one of the five key principles of
 * object-oriented design that help create flexible and maintainable systems.
 *
 * Dependency Inversion Principle (DIP):
 * The principle suggests two important things:
 *
 * High-level modules should not depend on low-level modules. Both should depend on abstractions
 * (e.g., interfaces or abstract classes).
 *
 * Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.
 *
 * In simpler terms:
 * High-level logic (e.g., business logic) should not depend on the implementation details of lower-level modules
 * (e.g., data access or utility classes).
 *
 * Instead of high-level classes depending directly on low-level classes,
 * both should rely on abstractions (interfaces or abstract classes).
 *
 * This makes the system more flexible and easier to maintain or modify because changes in one module
 * won’t directly affect another.
 *
 */