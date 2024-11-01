package com.cwsoft.not_so_solid.isp;


public class Developer implements Worker {
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



