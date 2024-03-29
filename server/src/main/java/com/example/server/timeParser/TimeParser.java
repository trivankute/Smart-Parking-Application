package com.example.server.timeParser;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeParser {

    private static final TimeParser instance = new TimeParser();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

    private TimeParser() {}

    public static TimeParser getInstance() {
        return instance;
    }

    public LocalDateTime parse(String timeString) {
        return LocalDateTime.parse(timeString, formatter);
    }
}
