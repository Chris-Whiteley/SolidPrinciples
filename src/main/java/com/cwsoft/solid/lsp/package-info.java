package com.cwsoft.solid.lsp;

/**
 * The "L" in SOLID stands for the Liskov Substitution Principle (LSP), which was introduced by Barbara Liskov
 * in 1987. This principle states that subtypes must be substitutable for their base types without altering the
 * correctness of the program. In other words, objects of a derived class should be able to replace objects of
 * the base class without affecting the behavior of the system.
 *
 * Key Idea:
 * If a class S is a subclass of class T, then instances of T should be replaceable with instances of S without
 * affecting the correctness of the program. The derived class should extend the base class behavior in a way that
 * is predictable and preserves the expectations set by the base class.
 *
 * Why is LSP important?
 * It ensures that a subclass can be used anywhere its parent class is expected.
 * It helps to maintain proper inheritance hierarchies and polymorphism.
 * Violating LSP can lead to fragile code, where substituting a subclass for a parent class causes unexpected
 * behavior or errors.
 */