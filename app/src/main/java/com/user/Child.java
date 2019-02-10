package com.user;

import java.util.HashMap;
import com.user.Program;

import java.util.*;

public class Child {
    Map<String, Program> programs;
    String name;
    Integer points;
    Integer currentPoints;

    public Child(String name) {
        programs = new HashMap<String, Program>();
        this.name = name;
        this.currentPoints = 0;
    }

    public void setProgram(Program program) {
        if (!programs.containsKey(program.getName())) {
            programs.put(program.getName(), program);
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
