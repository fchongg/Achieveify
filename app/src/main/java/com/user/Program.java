package com.user;

import java.sql.Time;
import java.util.*;

public class Program {
    String program;
    int dataCounter;
    int numIntervals;
    int interval;
    int[] todayData;
    Queue<int[]> data = new LinkedList<>();


    public Program(String program, int startHour, int startMinute, int endHour, int endMinute, int interval) {
        this.program = program;
        dataCounter = 0;
        this.interval = interval;
        findIntervalSize(startHour, startMinute, endHour, endMinute, interval);
    }

    public String getName() {
        return this.program;
    }

    private void addData() {
        if (dataCounter == 3) {
            data.remove();
            dataCounter--;
        } else {
            todayData = new int[numIntervals];
            dataCounter++;
        }
    }

    private void findIntervalSize(int startHour, int startMin, int endHour, int endMin, int interval){
        int totalTimeMin = (endHour-startHour)*60 - startMin + endMin;
        numIntervals = totalTimeMin/interval;
    }

    public int getInterval() {
        return interval;
    }
}
