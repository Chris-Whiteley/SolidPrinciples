package com.cwsoft.not_so_solid.isp;

/**
 * In this example:
 *
 * Both Developer and Robot implement the same Worker interface.
 * The Robot class is forced to implement methods like attendMeetings() and submitTimesheet(), which it
 * does not need, violating ISP.
 *
 * This can lead to bloated, unclear interfaces and awkward implementations.
 */
public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Performing tasks");
    }

    @Override
    public void attendMeetings() {
        // Robots don't attend meetings, but we are forced to implement this method
        throw new UnsupportedOperationException("Robots don't attend meetings");
    }

    @Override
    public void submitTimesheet() {
        // Robots don't submit timesheets, but we are forced to implement this method
        throw new UnsupportedOperationException("Robots don't submit timesheets");
    }
}