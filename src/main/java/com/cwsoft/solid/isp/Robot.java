package com.cwsoft.solid.isp;


/**
 * In this improved design:
 *
 * Developer implements all three interfaces (Workable, Attendable, TimesheetSubmittable) because it
 * performs all those activities.
 *
 * Robot only implements the Workable interface because it only needs to perform tasks and doesn't attend
 * meetings or submit timesheets.
 *
 * Benefits:
 * Clear, focused interfaces: Each interface has a single responsibility.
 *
 * Flexible implementation: Classes only implement the interfaces that are relevant to them.
 *
 * Avoids unnecessary method implementations: No more "empty" or "unsupported" method implementations like
 * in the not so solid example.
 *
 *  This demonstrates how the Interface Segregation Principle helps avoid bloated interfaces and makes the
 *  system more adaptable and maintainable!
 */

public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Performing tasks");
    }
    // Robot doesn't need to implement Attendable or TimesheetSubmittable
}