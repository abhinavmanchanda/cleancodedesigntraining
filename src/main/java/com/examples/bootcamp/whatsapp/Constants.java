package com.examples.bootcamp.whatsapp;

import java.util.TreeMap;

class Constants {
    public static final long MILLISECONDS_PER_HOUR = 1000L * 60 * 60;
    public static final long MILLISECONDS_PER_DAY = MILLISECONDS_PER_HOUR * 24;
    public static final long MILLISECONDS_PER_WEEK = MILLISECONDS_PER_DAY * 7;
    public static final TreeMap<Long, String> MILLISECONDS_PER_UNIT_MAPPING = new TreeMap<>() {{
        put(MILLISECONDS_PER_HOUR, "hours");
        put(MILLISECONDS_PER_DAY, "days");
        put(MILLISECONDS_PER_WEEK, "weeks");
    }};
}
