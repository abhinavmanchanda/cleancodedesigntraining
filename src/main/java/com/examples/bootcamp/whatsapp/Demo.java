package com.examples.bootcamp.whatsapp;

import java.sql.Date;

public class Demo {
    public static void main(String[] args) {
        Duration duration = new Duration(Constants.MILLISECONDS_PER_UNIT_MAPPING);
        System.out.println(duration.since(new Date(System.currentTimeMillis() - 2 * Constants.MILLISECONDS_PER_HOUR  - 1)));
    }
}
