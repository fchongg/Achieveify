package com.user;

import java.util.HashMap;

import com.example.achieveify.ChildScreen;
import com.user.Program;

import java.util.*;

public class Child {
    Map<String, Program> programs;
    String name;
    Integer points;
    Integer currentPoints;
    int interval;
    ChildScreen childScreen;

    public Child(String name) {
        programs = new HashMap<String, Program>();
        childScreen = new ChildScreen();
        this.name = name;
        this.currentPoints = 0;
        interval = 0;
    }

    public void setProgram(Program program) {
        if (!programs.containsKey(program.getName())) {
            programs.put(program.getName(), program);
            childScreen.setInterval(program.getInterval());
        }
    }

    public Program getProgram(String program_name) {
        if (programs.containsKey(program_name)) {
            return programs.get(program_name);
        }
        return null;
    }

    public Map<String, Program> getPrograms() {
        return programs;
    }

    public void setReward(Integer points) {
        this.points = points;
    }

    public Integer getCurrentPoints() {
        return this.currentPoints;
    }
}
