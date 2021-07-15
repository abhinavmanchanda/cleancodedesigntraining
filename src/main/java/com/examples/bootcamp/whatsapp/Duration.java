package com.examples.bootcamp.whatsapp;

import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Duration {

    private TreeMap<Long, String> millisecondsPerUnit;

    public Duration(TreeMap<Long, String> millisecondsPerUnit) {
        this.millisecondsPerUnit = millisecondsPerUnit;
    }

    public String since(Date lastActivityTime) {
        long timeIntervalInMilliseconds = System.currentTimeMillis() - lastActivityTime.getTime();
        Map.Entry<Long, String> floorEntryDuration = millisecondsPerUnit.floorEntry(timeIntervalInMilliseconds);
        String unit = floorEntryDuration.getValue();
        long numberOfUnits = timeIntervalInMilliseconds / floorEntryDuration.getKey();
        return numberOfUnits + " " + unit;
    }
}

