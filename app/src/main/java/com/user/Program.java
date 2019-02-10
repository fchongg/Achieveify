package com.user;

import java.sql.Time;

public class Program {
    String program;


    public Program(String program, Integer startHour, Integer startMinute, Integer endHour, Integer endMinute, Integer interval) {
        this.program = program;
    }

    public String getName() {
        return this.program;
    }
}
