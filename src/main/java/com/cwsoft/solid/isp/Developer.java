package com.cwsoft.solid.isp;

public class Developer implements Workable, Attendable, TimesheetSubmittable {
    @Override
    public void work() {
        System.out.println("Writing code");
    }

    @Override
    public void attendMeetings() {
        System.out.println("Attending technical meetings");
    }

    @Override
    public void submitTimesheet() {
        System.out.println("Submitting timesheet");
    }
}


